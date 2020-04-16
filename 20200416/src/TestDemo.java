import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @Description:
 * @USer:LD
 * @Date: 2020-04-16
 * @time: 18:34
 **/
class Person {
    //字段->成员变量   定义在方法外面
    //实例成员变量  对象的里面
   private String name;
    private int age;
    //行为->方法   定义在类里
    //实例成员方法


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("eat()!");
    }
    public void sleep() {
        System.out.println("sleep()!");
    }
    public static int a = 0;//静态成员变量    输入类  不属于方法
}
public class TestDemo {

    public static void main(String[] args) {
        //实例化对象
        Person per = new Person();
        per.setName("ld ");

        System.out.println(per.getName());

    }


    public static void main2(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[3];
        array[1] = new int[2];
        System.out.println(Arrays.deepToString(array));
    }


    public static void main1(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        for ( int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
         System.out.println(Arrays.deepToString(arr));
    }

}
