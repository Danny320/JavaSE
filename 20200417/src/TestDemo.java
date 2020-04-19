import java.util.Arrays;

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

    public Person() {
        this("zhangsan",18);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class TestDemo {
    public static void swap(int arr1[],int[] arr2) {
        for(int i = 0;i<arr1.length;i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        System.out.println("交换前：");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        swap(arr1,arr2);
        System.out.println("交换后：");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }



    public static void main1(String[] args) {
        Person per = new Person();//实例化一个对象
        System.out.println(per.toString());
    }
}