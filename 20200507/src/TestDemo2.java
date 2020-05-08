import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200507
 * @Description:
 * @USer:LD
 * @Date: 2020-05-08 15:10
 * @time: 15:10
 **/
public class TestDemo2 {

public static String reverse(String str,int begin,int end) {
    char[] ch = str.toCharArray();//将字符串变为字符数组
    while(begin < end) {
        char tmp = ch[begin];
        ch[begin] = ch[end];
        ch[end] = tmp;
        begin++;
        end--;
    }
    String ret = new String(ch);
    return ret;
}
public static String func2(String str ,int n) {
     str = reverse(str,0,n-1);
     str = reverse(str,n,str.length()-1);
      str = reverse(str,0,str.length()-1);
    return str;
}
    public static void main(String[] args) {
        //String str  = "abcdefg";
        //String ret = reverse(str,0,str.length()-1);
       // System.out.println(ret);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        String ret = func2(str,n);
        System.out.println(ret);


    }

    public static String func2(String str) {
        String[] strings = str.split(" ");
        String ret = "";
        for (String s:strings
             ) {
            ret+=s;
        }
        return ret;
    }
    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //不能用next 遇到空格结束了
        String ret = func2(str);
        System.out.println(ret);
    }
    public static void main7(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strings = str.split("&");//以‘.’号进行分割
        for (String s1:strings) {
            String[] strings1 = s1.split("=");
            for (String s:strings1) {
                System.out.println(s);
            }

        }
    }
    public static void main6(String[] args) {
        String str = "192-3435#5654#6";
        String[] strings = str.split(" |-|#");//以‘.’号进行分割
        for (String s:strings) {
            System.out.println(s);

        }
    }
    public static void main5(String[] args) {
        String str = "192.3435.5654.6";
        String[] strings = str.split("\\.");//以‘.’号进行分割
        for (String s:strings) {
            System.out.println(s);

        }
    }

    public static void main4(String[] args) {
        String str = "abcabcabc";
        boolean flg = str.contains("abc");//查找是否包含abc
       System.out.println(flg);
    }


    public static void main3(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));
    }

    public static boolean func(String str) {
        for (int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "1234566";
        boolean flg = func(str);
        System.out.println(flg);
    }


    public static void main1(String[] args) {
        char[] val = {'a','b','c','d'};
        String str = new String(val,1,3);//得到bcd
        System.out.println(str);
        String str2 = "hello";
        char ch = str2.charAt(1);//得到e
        System.out.println(ch);
        char[] val2 = str2.toCharArray();//将字符串变为字符数组
        System.out.println(Arrays.toString(val2));
    }
}
