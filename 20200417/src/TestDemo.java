/**
 * Created with Intellij IDEA
 *
 * @Description:
 * @USer:LD
 * @Date: 2020-04-17
 * @time: 16:14
 **/


class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person per = new Person();//实例化一个对象
        per.setAge(18);
        per.setName("罗丹");
       System.out.println( per.toString());
    }
}