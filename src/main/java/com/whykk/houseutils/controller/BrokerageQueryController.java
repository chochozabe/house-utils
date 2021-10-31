package com.whykk.houseutils.controller;

import com.whykk.houseutils.constants.ActionType;
import com.whykk.houseutils.policy.BrokeragePolicy;
import com.whykk.houseutils.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long CalcBrokerage(@RequestParam ActionType actionType, @RequestParam Long price) {
//        if (actionType == ActionType.PURCAHSE) {
//            PurchaseBrokeragePolicy policy = new PurchaseBrokeragePolicy();
//            return policy.calculate(price);
//        } else if (actionType == ActionType.RENT) {
//            RentBrokeragePolicy policy =  new RentBrokeragePolicy();
//            return policy.calculate(price);
//        }
//
//        change ↓ - BrokeragePolicyFactory 추가

        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
