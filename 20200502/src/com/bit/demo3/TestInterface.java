package com.bit.demo3;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200502
 * @Description:
 * @USer:LD
 * @Date: 2020-05-02 20:53
 * @time: 20:53
 **/

/**
 * 接口（interface）；
 * 1,接口当中的方法都是抽象方法
 * 2,其实可以有具体实现的方法。这个方法是被default修饰的（一般情况下不会用）
 * 3，接口当中定义的成员变量，默认是常量；
 * 4,接口当中的成员变量默认是：public static final  成员方法默认的是：public abstract
 * 5,接口是不能被实例化的。
 * 6,接口和类之间的关系 ：implements
 * 7，接口是为了解决java单继承的问题，可以实现多个接口。
 * 8,只要这个类实现了该接口，就可以发生向上转型。
 */
interface Shape {
    public abstract void draw();
    //public static final int a = 10;
//    default void func() {
//        System.out.println("hehe");
//    }
}
class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
public class TestInterface {
    public static void main(String[] args) {
        Shape shape = new Cycle();
        shape.draw();
    }
}
