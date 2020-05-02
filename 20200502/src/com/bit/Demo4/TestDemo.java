package com.bit.Demo4;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200502
 * @Description:
 *接口的使用实例：
 *    一般情况下：自定义类型进行比较需要是可比较的
 *    Comparable    Comparator   区别的！！！
 * @USer:LD
 * @Date: 2020-05-02 22:01
 * @time: 22:01
 **/
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int scoce;

    public Student(String name, int age, int scoce) {
        this.name = name;
        this.age = age;
        this.scoce = scoce;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scoce=" + scoce +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.scoce > o.scoce) {
            return 1;
        }else if(this.scoce == o.scoce) {
            return 0;
        }else {
            return -1;
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("张三",18,89);
        Student student2 = new Student("李四",19,77);
        Student student3 = new Student("王五",13,68);
        Student student4 = new Student("小六",20,99);
        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        Arrays.sort(students);//排序默认从小到大
        System.out.println(Arrays.toString(students));
//        if(student1.compareTo(student2) > 0) {
//            System.out.println("student1的年龄 < student2");
//        }
    }
}
