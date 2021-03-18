package com.liu.design_3_model.structure_02Bridge.imptLayer;

import com.liu.design_3_model.structure_02Bridge.IBrand;

public class ImptIPhone implements IBrand {
    @Override
    public void open() {
        System.out.println("苹果手机开机。。。");
    }

    @Override
    public void shutdown() {
        System.out.println("苹果手机关机。。。");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话。。。");
    }
}
