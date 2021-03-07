package com.liu.model_1_creation_02factory.simplefactory.pizzaSale_NG.pizza;

public abstract class Pizza {
    protected String name;
    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();
    public void bake () {
        System.out.println(name + "正在烘烤中...");
    }

    public void cut () {
        System.out.println(name + "正在切割中...");
    }

    public void box () {
        System.out.println(name + "正在包装中...");
    }

}
