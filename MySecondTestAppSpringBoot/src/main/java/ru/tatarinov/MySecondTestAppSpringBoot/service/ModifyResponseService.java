package ru.tatarinov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.tatarinov.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
