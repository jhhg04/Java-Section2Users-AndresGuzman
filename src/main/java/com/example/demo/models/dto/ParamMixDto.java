package com.example.demo.models.dto;

public class ParamMixDto {
    private String message;
    private Integer code;

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
