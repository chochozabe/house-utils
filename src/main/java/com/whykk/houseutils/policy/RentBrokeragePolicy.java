package com.whykk.houseutils.policy;

/* 임대차일 경우에 중계수수료를 계산하는 클래스 */
public class RentBrokeragePolicy implements BrokeragePolicy {
    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;

        if (price < 50_000_000) {
            rule = new BrokerageRule(0.5, 200_000L);
        } else if (price < 100_000_000) {
            rule = new BrokerageRule(0.4, 300_000L);
        } else if (price < 300_000_000) {
            rule = new BrokerageRule(0.3, null);
        } else if (price < 600_000_000) {
            rule = new BrokerageRule(0.4, null);
        } else {
            rule = new BrokerageRule(0.8, null);
        }

        return rule;
    }
}
