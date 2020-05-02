package com.bit.Demo;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200502
 * @Description:
 * 理解多态
 * @USer:LD
 * @Date: 2020-05-02 18:14
 * @time: 18:14
 **/
class Shape {
    public void draw(){

    }
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
public class TestDemo2 {

    /**
     * 什么是多态
     * 1，父类引用 引用子类对象
     * 2，父类和子类有同名的覆盖方法
     * 3，通过父类引用引用这个重写的方法的时候。
     * @param
     */
    public static void drawShapes() {
        Shape[] shapes = {new Cycle(),new React(),new Flower()};
        for(Shape shape : shapes) {
            shape.draw();
        }
    }
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);
        drawShapes();
    }
}
