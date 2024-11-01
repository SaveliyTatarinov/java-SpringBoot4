package ru.tatarinov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    @NotNull
    private String uid;
    @NotNull
    private String operationUid;
    @NotNull
    private String systemTime;
    @NotNull
    private Codes code;
    @NotNull
    private ErrorCodes errorCode;
    @NotNull
    private ErrorMessages errorMessage;
}
