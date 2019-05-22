package com.desgin.mode.builder;

import com.desgin.mode.builder.bean.Car;

/**
 * @ClassName: Builder
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/5/18 8:56
 */
public abstract class Builder {

    //创建构建者时初始化 获取结果
    protected Car car = new Car();

    //构建bean的部件
    public abstract void buildTyre(Integer tyre);

    public abstract void buildsTeeringWheel(String teeringWheel);

    public abstract void buildEngine(String engine);

    //返回构建对象
    public Car getResult() {
        return car;
    }


}
