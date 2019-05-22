package com.desgin.mode.builder.impl;

import com.desgin.mode.builder.Builder;

/**
 * @ClassName: BuilderImpl
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/5/18 9:01
 */
public class BuilderImpl extends Builder {


    public void buildTyre(Integer tyre) {
        car.setTyre(tyre);
    }


    public void buildsTeeringWheel(String teeringWheel) {
        car.setSteeringWheel(teeringWheel);
    }


    public void buildEngine(String engine) {
        car.setEngine(engine);
    }

}
