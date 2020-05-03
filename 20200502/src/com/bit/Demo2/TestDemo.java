package com.bit.Demo2;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200502
 * @Description:
 * 抽象类：
 * 1，抽象方法：被abstract修饰的方法为抽象方法。抽象方法可以没有具体的实现
 * 2，包含抽象方法的类，抽象类
 * 注意：
 * 1，抽象类不能被实例化。不能new
 * 2，类的数据成员和普通类没有区别。
 * 3，抽象类主要就是用来被继承的。
 * 4，如果一个类继承了这个抽象类，那么这个类必须重写抽象类当中的抽象方法。
 * 5，当抽象类A继承抽象B 那么A可以不重写B中的方法，但是一旦A再被继承，那么一定还要重写这个抽象方法。
 * 6，抽象类或抽象方法一定不能被final修饰。
 * @USer:LD
 * @Date: 2020-05-02 19:58
 * @time: 19:58
 **/
abstract class Shape {
    public abstract void draw();
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}

class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}
public class TestDemo {
    public static void draw(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        Shape shape3 = new Flower();
        draw(shape1);
        draw(shape2);
        draw(shape3);
    }
}
