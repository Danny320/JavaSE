package com.bit.demo2;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200427
 * @Description:
 *    多态
 *    运行时绑定发生条件：父类引用 引用子类对象
 *                    通过父类引用调用同名覆盖方法就会发生运行时绑定
 * @USer:LD
 * @Date: 2020-05-01 21:55
 * @time: 21:55
 **/

class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat() {
        System.out.println("Animal::eat()");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        System.out.println("cat(string)");
    }
    public void eat() {
        System.out.println("Cat::eat()");
    }

}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
        System.out.println("Bird(string)");
    }
    public void fly() {
        System.out.println("Bird::fly()");
    }
}

public class TestMain {

    /**
     * 向下转型
     * 注意：向下转型非常不安全
     * @param
     */
    public static void main(String[] args) {
        Animal animal = new Bird("八哥");
        animal.eat();
        //向下转型
        Bird bird = (Bird)animal;
        bird.fly();
        //异常
        //A instanceof B   判断A是不是B的一个实例
        if(animal instanceof Cat) {
            Cat cat = (Cat)animal;
            cat.eat();
        }

    }
    public static void func(Animal animal) {
        animal.eat();
    }
    public static Animal func() {
        return new Cat("咪咪");
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("咪咪");
        func(cat);
        Animal animal = func();
        animal.eat();
    }
    //向上转型
    public static void main2(String[] args) {
        //向上转型 ---> 父类引用 引用子类对象
        //向上转型后，通过父类的引用 只能访问父类自己的方法或属性（只能访问自己特有的）
        Animal animal = new Cat("咪咪");
        animal.eat();//输出结果为Cat的eat
    }
    public static void main1(String[] args) {
        Animal animal = new Animal("豆豆");
        Cat cat = new Cat("咪咪");
    }
}
