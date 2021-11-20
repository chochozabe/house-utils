package com.whykk.houseutils.exception;

import java.io.Serializable;

public class HouseUtilsException extends RuntimeException implements Serializable {

    private ErrorCode errorCode;

    public HouseUtilsException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}