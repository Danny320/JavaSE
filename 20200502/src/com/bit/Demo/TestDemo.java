package com.bit.Demo;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200502
 * @Description:
 * @USer:LD
 * @Date: 2020-05-02 17:57
 * @time: 17:57
 **/
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name +"正在吃！");
    }
}
class Cat extends Animal {
    public Cat(String name, String huzi) {
        super(name);
        this.huzi = huzi;
    }
    public void eat() {
        System.out.println(this.name +"etjry正在吃！");
    }
    public String huzi;

}
public class TestDemo {
    public static void main(String[] args) {
        Animal animal = new Cat("mimi","胡子");
        animal.eat();
        Cat cat = (Cat)animal;
        ((Cat) animal).huzi = "mimi";

    }
}
