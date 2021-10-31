package com.whykk.houseutils.policy;

/* 매매일 경우에 중계수수료를 계산하는 클래스 */
public class PurchaseBrokeragePolicy implements BrokeragePolicy{
//    public Long calculate(Long price) {
//        BrokerageRule rule;
//
//        if (price < 50_000_000) {
//            rule = new BrokerageRule(0.6, 250_000L);
//        } else if (price < 200_000_000) {
//            rule = new BrokerageRule(0.5, 800_000L);
//        } else if (price < 600_000_000) {
//            rule = new BrokerageRule(0.4, null);
//        } else if (price < 900_000_000) {
//            rule = new BrokerageRule(0.5, null);
//        } else {
//            rule = new BrokerageRule(0.9, null);
//        }
//
//        return rule.calcMaxBrokerage(price);
//    }

//   chanage ↓

//    public Long calculate(Long price) {
//        BrokerageRule rule = createBrokerageRule(price);
//        return rule.calcMaxBrokerage(price);
//    }
//
//    private BrokerageRule createBrokerageRule(Long price) {
//        BrokerageRule rule;
//
//        if (price < 50_000_000) {
//            rule = new BrokerageRule(0.6, 250_000L);
//        } else if (price < 200_000_000) {
//            rule = new BrokerageRule(0.5, 800_000L);
//        } else if (price < 600_000_000) {
//            rule = new BrokerageRule(0.4, null);
//        } else if (price < 900_000_000) {
//            rule = new BrokerageRule(0.5, null);
//        } else {
//            rule = new BrokerageRule(0.9, null);
//        }
//
//        return rule;
//    }

//   chanage ↓ - BrokeragePolicy Interface 추가

    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;

        if (price < 50_000_000) {
            rule = new BrokerageRule(0.6, 250_000L);
        } else if (price < 200_000_000) {
            rule = new BrokerageRule(0.5, 800_000L);
        } else if (price < 600_000_000) {
            rule = new BrokerageRule(0.4, null);
        } else if (price < 900_000_000) {
            rule = new BrokerageRule(0.5, null);
        } else {
            rule = new BrokerageRule(0.9, null);
        }

        return rule;
    }
}
