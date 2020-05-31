/**
 * Created with Intellij IDEA
 *
 * @program: 20200531
 * @Description:
 * @USer:LD
 * @Date: 2020-05-31 10:35
 * @time: 10:35
 **/
class Student {
    //私有属性name
    private String name = "bit";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("Student()");
    }

    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }

    private void eat(){
        System.out.println("i am eat");
    }

    public void sleep(){
        System.out.println("i am pig");
    }

    private void function(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Class c1 = null;
        try {
            c1 = Class.forName("Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class c2 = Student.class;
        Student s1 = new Student();
        s1.getClass();
    }
}
