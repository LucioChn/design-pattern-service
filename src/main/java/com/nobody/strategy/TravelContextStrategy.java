package com.nobody.strategy;

import org.springframework.util.StringUtils;

/**
 * Context上下文
 * 
 * @author Μr.ηobοdy
 *
 * @date 2020-06-07
 *
 */
public class TravelContextStrategy {

    public static String travel(String travelType) {
        if (StringUtils.isEmpty(travelType)) {
            return "travelType不能为空!";
        }
        TravelStrategy travelStrategy = StrategyFactory.getTravelStrategy(travelType);
        if (travelStrategy == null) {
            return "没有找到具体的策略，travelType:" + travelType;
        }
        return travelStrategy.travel();
    }

}
