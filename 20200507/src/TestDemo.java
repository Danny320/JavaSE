import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200507
 * @Description:
 * 字符串类型String
 * @USer:LD
 * @Date: 2020-05-07 17:18
 * @time: 17:18
 **/

public class TestDemo {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello").intern();//把当前在常量池当中“hello”的引用返回给str2
        System.out.println(str1==str2);
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1==str2);//比较的是引用
        System.out.println(str1.equals(str2));//比较的是字符串的内容
        String str3 = "hello";
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }


    public static void func(String str ,char[] array) {
        str = "abcdef";
        array[0] = 'g';
    }
    public static void main5(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
    }

    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "abc";
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel"+"lo";//字符串常量 编译时期已经变成：hello
        System.out.println(str1 == str2);//true
        String str3 = new String("hel") +"lo";
        System.out.println(str3 == str1);//false
    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1==str2);//false  引用类型比较的是地址
        String str3 = "hello";
        System.out.println(str1==str3);//true

    }

    public static void main1(String[] args) {
        String str1 = "hello";
        System.out.println(str1);
        String str2 = new String("hello2");
        System.out.println(str2);
        char[] val = {'a','b','c','c'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
