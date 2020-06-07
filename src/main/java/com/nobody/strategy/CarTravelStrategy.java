package com.nobody.strategy;

import org.springframework.stereotype.Component;

@Component
public class CarTravelStrategy implements TravelStrategy {

    @Override
    public String travel() {
        return "我是自驾的交通方式...";
    }

}
