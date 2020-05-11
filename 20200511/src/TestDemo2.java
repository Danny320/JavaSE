import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200511
 * @Description:
 * @USer:LD
 * @Date: 2020-05-11 19:11
 * @time: 19:11
 **/
class Student {
    private String name;
    private String class1;
    private  double grade;

    public Student(String name, String class1, double grade) {
        this.name = name;
        this.class1 = class1;
        this.grade = grade;
    }
}
public class TestDemo2 {

public static List func(String str1,String str2) {
    List<Character> list = new ArrayList<>();
    for(int i = 0;i < str1.length();i++) {
        char ch = str1.charAt(i);
        if(!str2.contains(ch+"")) {
            list.add(ch);
        }
    }
return list;
}
    public static void main3(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> ret = func(str1,str2);
        for (char ch:ret) {
            System.out.println(ch);
        }
        System.out.println();
    }


    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }




    public static void main1(String[] args) {
        Student student1 = new Student("张三","二班",99.0);
        Student student2 = new Student("李四","一班",98.5);
        Student student3 = new Student("小二","二班",59.0);
        Student student4 = new Student("王五","二班",79.0);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println(list);
    }
}
