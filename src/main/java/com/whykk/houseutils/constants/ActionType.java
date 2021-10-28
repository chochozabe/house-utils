package com.whykk.houseutils.constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ActionType {
    PURCAHSE("매매"),
    RENT("임대차");

    private String description;

}
