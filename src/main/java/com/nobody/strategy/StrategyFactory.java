package com.nobody.strategy;

/**
 * 具体策略类生产工厂类
 * 
 * @author Μr.ηobοdy
 *
 * @date 2020-06-07
 *
 */
public class StrategyFactory {

    public static TravelStrategy getTravelStrategy(String travelType) {

        // 通过枚举获取具体策略类名
        String className = TravelEnumStrategy.valueOf(travelType).getClassName();

        try {
            // 反射机制获取具体策略类实例
            return (TravelStrategy) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
