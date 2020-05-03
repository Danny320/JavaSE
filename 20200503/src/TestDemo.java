import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @program: TestBook
 * @Description:
 * 如果想克隆自定义类型
 * 1，实现接口
 * public interface Cloneable {
 * }
 * 空接口：也把它叫做标记接口，只要一个类实现了这个接口，那么就标记了这个类，是可以进行clone的。
 * 2，重写 父类的克隆方法 Object clone() 方法
 *
 * @USer:LD
 * @Date: 2020-05-03 15:27
 * @time: 15:27
 **/
class Money implements Cloneable {
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int  age;

    Money m = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person2.m.money);
        System.out.println(person1.m.money);
        System.out.println("==========修改================");
        person2.age = 99;
        person2.m = (Money) person1.m.clone();
        person2.m.money = 99.7;
        System.out.println(person2.m.money);
        System.out.println(person1.m.money);

//        int[] array = {1,2,3,4};
//        int[] array2 = array.clone();
//        System.out.println(Arrays.toString(array2));
    }
}

