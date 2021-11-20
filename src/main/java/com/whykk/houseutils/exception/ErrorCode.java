package com.whykk.houseutils.exception;

public enum ErrorCode {

    ENTITY_NOT_FOUND(1001, "Entity가 존재하지 않습니다.");

    private int errorCode;
    private String message;

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    ErrorCode(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}