package ru.tatarinov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.tatarinov.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
