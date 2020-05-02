package com.bit.demo3;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200502
 * @Description:
 * 多继承
 * @USer:LD
 * @Date: 2020-05-02 21:22
 * @time: 21:22
 **/
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

//一个类可以继承一个普通类/抽象类，并且可以同时实现多个接口（先继承）
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}

class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}
public class TestMoreExtends {
    public static void walk(IRunning iRunning) {
        iRunning.run();
    }
    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        walk(cat);
        Frog frog = new Frog("青蛙");
        walk(frog);
    }
}
