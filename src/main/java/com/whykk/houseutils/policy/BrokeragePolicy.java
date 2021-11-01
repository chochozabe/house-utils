package com.whykk.houseutils.policy;

/**
 * @author chochozabe
 */
public interface BrokeragePolicy {
    BrokerageRule createBrokerageRule(Long price);

    default Long calculate(Long price) {
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }
}
