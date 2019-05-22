package com.desgin.mode.builder.bean;

/**
 * @ClassName: Car
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/5/18 8:53
 */
public class Car {

    private Integer tyre;//轮胎

    private String steeringWheel;//方向盘

    private String engine;//发动机

    public Integer getTyre() {
        return tyre;
    }

    public void setTyre(Integer tyre) {
        this.tyre = tyre;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyre=" + tyre +
                ", steeringWheel='" + steeringWheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
