package com.liuscoding.bean;

import org.springframework.stereotype.Component;

/**
 * @className: Car
 * @description:
 * @author: liusCoding
 * @create: 2020-05-22 21:21
 */
@Component
public class Car {


    public  Car(){
        System.out.println(" 调用构造方法。。。。。。。。。。。。。");
    }

    public void init(){
        System.out.println("调用初始化方法。。。。。。。。。。");
    }

    public void destroy(){
        System.out.println("调用销毁方法。。。。。。。。。。。。");
    }
}

