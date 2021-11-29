package com.whykk.houseutils.policy;

import com.whykk.houseutils.constants.ActionType;
import com.whykk.houseutils.exception.ErrorCode;
import com.whykk.houseutils.exception.HouseUtilsException;

public class BrokeragePolicyFactory {
    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType)
        {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new HouseUtilsException(ErrorCode.INVALID_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
}
