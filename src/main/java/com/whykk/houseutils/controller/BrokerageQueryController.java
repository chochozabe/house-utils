package com.whykk.houseutils.controller;

import com.whykk.houseutils.constants.ActionType;
import com.whykk.houseutils.policy.BrokeragePolicy;
import com.whykk.houseutils.policy.BrokeragePolicyFactory;
import com.whykk.houseutils.service.ApartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chochozabe
 * <p>
 * 중계수수료가 얼마인지 조회하는 컨트롤러
 */
@RestController
@AllArgsConstructor
public class BrokerageQueryController {
    private final ApartmentService apartmentService;

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

    @GetMapping("/api/calc/apartment/{apartmentId}")
    public Long calcBrokerageByApartmentId(@PathVariable Long apartmentId, @RequestParam ActionType actionType) {
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);

        return policy.calculate(apartmentService.getPriceOrThrow(apartmentId));
    }
}
