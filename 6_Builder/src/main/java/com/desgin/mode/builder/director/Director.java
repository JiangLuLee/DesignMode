package com.desgin.mode.builder.director;

import com.desgin.mode.builder.Builder;
import com.desgin.mode.builder.bean.Car;

import java.net.CacheRequest;

/**
 * @ClassName: Director
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/5/18 9:10
 */
public class Director {

    private Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    //组装产品
    /*public Car construct() {

        builder.buildTyre();
        builder.buildsTeeringWheel();
        builder.buildEngine();

        return builder.getResult();
    }*/
    //组装产品
    public Car construct(Car consumerCar) {

        builder.buildTyre(consumerCar.getTyre());
        builder.buildsTeeringWheel(consumerCar.getSteeringWheel());
        builder.buildEngine(consumerCar.getEngine());

        return builder.getResult();
    }
}
