/**
 * Created with Intellij IDEA
 *
 * @program: 20200427
 * @Description:
 * @USer:LD
 * @Date: 2020-04-27 18:37
 * @time: 18:37
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

class Bird extends Animal{
    public Bird(String name) {
        super(name);
        System.out.println("Bird(string)");
    }
    public void fly() {
        System.out.println("Bird::fly()");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        System.out.println("cat(string)");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();
        Bird bird = new Bird("八哥");
        bird.fly();
        bird.eat();
    }
}
