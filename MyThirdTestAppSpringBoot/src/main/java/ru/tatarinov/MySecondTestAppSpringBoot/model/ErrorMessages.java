package ru.tatarinov.MySecondTestAppSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorMessages {
    EMPTY(""),
    VALIDATION("Ошибка валидации"),
    UNSUPPORTED("Произошла непредвиденная ошибка"),
    UNKNOWN("Не поддерживаемая");

    private final String description;

    ErrorMessages(String description){
        this.description = description;
    }

    @JsonValue
    public String getName(){
        return description;
    }
}
