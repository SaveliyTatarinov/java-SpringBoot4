package ru.tatarinov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import ru.tatarinov.MySecondTestAppSpringBoot.model.Request;

import java.time.Duration;
import java.time.Instant;
@Service
public class ModifyTimeDiffRequestService implements ModifyRequestService{
    private static final Logger log = LoggerFactory.getLogger(ModifyTimeDiffRequestService.class);

    @Override
    public void modify(Request request) {
        Instant currentInstant = Instant.now();

        if (request.getReceivedTime() != null) {
            long timeDifferenceMillis = Duration.between(request.getReceivedTime(), currentInstant).toMillis();

            log.info("Time difference from Service 1 to Service 2: {} ms", timeDifferenceMillis);
        } else {
            log.warn("ReceivedTime in Request is null. Unable to calculate time difference.");
        }

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);
        new RestTemplate().exchange(
                "http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<Void>() {}
        );
    }
}
