package com.whykk.houseutils.policy;

import lombok.AllArgsConstructor;
import org.springframework.lang.Nullable;

/**
 * @author chochozabe
 * <p>
 * 가격이 특정 범위일 때 상한효율과 상한금액을 가지는 클래스
 * */
@AllArgsConstructor
public class BrokerageRule {
    private Double BrokeragePercent;

    @Nullable
    private Long limitAmount;

    public Long calcMaxBrokerage(Long price) {
        if (limitAmount == null) {
            return multPercent(price);
        }
        return Math.min(multPercent(price), limitAmount);
    }

    private Long multPercent(Long price) {
//        Double amount = Math.floor(BrokeragePercent / 100 * price);
//        return amount.longValue();

//        chanage ↓

        return Double.valueOf(Math.floor(BrokeragePercent / 100 * price)).longValue();
    }
}
