package com.desgin.mode.builder;

import com.desgin.mode.builder.bean.Car;
import com.desgin.mode.builder.director.Director;
import com.desgin.mode.builder.impl.BuilderImpl;

import java.util.logging.Logger;

/**
 * @ClassName: BuilderMainApp
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/5/18 9:14
 */
public class BuilderMainApp {

    private static Logger logger = Logger.getLogger(Builder.class.toString());
    private static Logger log = Logger.getGlobal();

    public static void main(String[] args) {

        //客户需求的Car
        Car consumerCar = new Car();
        consumerCar.setEngine("V8双缸发动机");
        consumerCar.setSteeringWheel("法拉利同款方向盘");
        consumerCar.setTyre(8);

        Director director = new Director();
        Builder builder = new BuilderImpl();
        director.setBuilder(builder);
        Car car = director.construct(consumerCar);
        logger.info(car.toString());
        log.info(car.toString());
    }
}
