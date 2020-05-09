import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200509
 * @Description:
 * @USer:LD
 * @Date: 2020-05-09 10:18
 * @time: 10:18
 **/
public class TestDemo {
    public static String[] mySplit(String str,String ch) {
        char[] val = str.toCharArray();

    }
    public static void main(String[] args) {
        String str = "asdvdsc$scdfbs&vf'g dgdrs*";
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
        String[] strings = mySplit(str,ch);


    }


    public static void main3(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6

    }


    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main2(String[] args){
        System.out.println(isAdmin("Admin"));
    }


    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main1(String[] args) {
        TestDemo ex = new TestDemo();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }
}
