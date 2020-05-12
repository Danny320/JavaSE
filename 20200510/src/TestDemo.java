import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200510
 * @Description:
 * 异常
 * @USer:LD
 * @Date: 2020-05-10 09:03
 * @time: 09:03
 **/
class Person implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            Person person1 = (Person)person.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }



    //自定义异常
    public static int divide(int x,int y) throws ArithmeticException{
        if(y == 0) {
            throw new ArithmeticException("y == 0");
        }
        return x/y;
    }
    public static void main4(String[] args) {
        try {
            int ret = divide(20,0);
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("除数为零");
        }
    }



    public static int func() {
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();//显示错误
            System.out.println("捕获到了空指针异常");
            return 3;
        }finally {
            return 2;
        }
    }
    public static void main3(String[] args) {
        System.out.println(func());
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            System.out.println(10/n);
        }catch (ArithmeticException e) {
            e.fillInStackTrace();
            System.out.println("除数异常");
        }finally {
            scanner.close();

        }
    }


    public static void main2(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array[3]);
        System.out.println("hello");//不会被执行
    }


    public static void main1(String[] args) {
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了空指针异常");
        }finally {
            System.out.println("finally块的代码肯定会被执行！"+"所以经常做一些善后工作，比如关闭资源");
        }
        System.out.println("hello");
    }
}
