package com.nobody.strategy;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 测试类
 * 
 * @author Μr.ηobοdy
 *
 * @date 2020-06-07
 *
 */
public class Main {

    public static void main(String[] args) {

        String travelType = "AIR_TRAVEL";
        String result = TravelContextStrategy.travel(travelType);
        System.out.println(result);

        // 基于数据库形式，将具体策略类信息保存在数据库，并且在具体策略类加上@Component注解注入到Spring容器管理
        // 通过id和具体策略类beanName映射一起，例如
        // {id:1,beanId:"carTravelStrategy"},{id:2,beanId:"airTravelStrategy"}
        // 调用方（例如前端）通过参数id，然后通过数据库查找到beanId，再通过Spring容器获取具体策略实例。
        String name = "carTravelStrategy"; // 此处省略了数据库获取步骤
        TravelStrategy travelStrategy = (TravelStrategy) SpringUtils.getBean(name);
        String result1 = travelStrategy.travel();
        System.out.println(result1);
    }

}
