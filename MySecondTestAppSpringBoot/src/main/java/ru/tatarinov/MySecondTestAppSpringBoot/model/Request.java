package ru.tatarinov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "Поле uid не заполнено")
    @Size(max = 32, message = "Максимальная длина uid не должна превышать 32 символа")
    private String uid;

    @NotBlank(message = "Поле operationUid не заполнено")
    @Size(max = 32, message = "максимальная длина operationUid не должна превышать 32 символа")
    private String operationUid;

    private String systemName;

    @NotBlank(message = "Поле systemTime не заполнено")
    private String systemTime;

    private String source;

    @Min(value = 1, message = "communicationId должно быть больше либо равно 1")
    @Max(value = 100000, message = "communicationId может быть меньше либо равно 100000")
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;
    private Instant receivedTime;

    @Override
    public String toString(){
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId='" + communicationId +
                ", templateId='" + templateId +
                ", productCode='" + productCode +
                ", smsCode='" + smsCode +
                ", receivedTime='" + receivedTime +
                '}';
    }
}