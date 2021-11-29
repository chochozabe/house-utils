package com.whykk.houseutils.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    INVALID_REQUEST("잘못된 요청입니다"),
    INTERNAL_ERROR("알 수 없는 에러가 발생하였습니다."),
    ENTITY_NOT_FOUND("Entity가 존재하지 않습니다.");

    private String message;

}