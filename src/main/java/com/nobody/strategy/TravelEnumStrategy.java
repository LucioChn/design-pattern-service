package com.nobody.strategy;

/**
 * 策略枚举类 保存所有具体策略类
 * 
 * @author Μr.ηobοdy
 *
 * @date 2020-06-06
 *
 */
public enum TravelEnumStrategy {

    // 火车方式
    TRAIN_TRAVEL("com.nobody.strategy.TrainTravelStrategy"),

    // 飞机方式
    AIR_TRAVEL("com.nobody.strategy.AirTravelStrategy"),

    // 汽车方式
    CAR_TRAVEL("com.nobody.strategy.CarTravelStrategy");

    // 具体策略类class全路径
    private String className;

    TravelEnumStrategy(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

}
