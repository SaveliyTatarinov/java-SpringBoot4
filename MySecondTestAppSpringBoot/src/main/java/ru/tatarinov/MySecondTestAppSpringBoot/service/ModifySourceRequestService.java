package ru.tatarinov.MySecondTestAppSpringBoot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.tatarinov.MySecondTestAppSpringBoot.model.Request;

@Service("ModifySourceRequestService")
public class ModifySourceRequestService implements ModifyRequestService {
    private static final Logger log = LoggerFactory.getLogger(ModifySourceRequestService.class);

    @Override
    public void modify(Request request) {
        String originalSource = request.getSource();
        request.setSource("new source");

        log.info("Modified source from '{}' to '{}'", originalSource, request.getSource());

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);
        new RestTemplate().exchange(
                "http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<Void>() {
                }
        );
    }
}
