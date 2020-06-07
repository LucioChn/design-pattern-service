package com.nobody.strategy;

public class AirTravelStrategy implements TravelStrategy {

    @Override
    public String travel() {
        return "我是坐飞机的交通方式...";
    }

}
