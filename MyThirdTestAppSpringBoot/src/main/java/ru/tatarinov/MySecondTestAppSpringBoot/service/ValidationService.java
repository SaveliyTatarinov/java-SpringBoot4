package ru.tatarinov.MySecondTestAppSpringBoot.service;

import org.springframework.validation.BindingResult;
import ru.tatarinov.MySecondTestAppSpringBoot.exception.ValidationFailedException;

public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
