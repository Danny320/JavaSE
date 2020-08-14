import java.util.Scanner;

/**
 * @author LD
 * @date 2020/8/14 11:17
 */
public class Main {
    public static void main1(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int a = 1;
        int b = 2;
        System.out.println(a/b);

        int num = 10;
        String str = num +"";
        String str2 = String.valueOf(num);
        int num2 = Integer.parseInt(str2);

    }


    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <=18) {
            System.out.println("少年");
        }else if(age >18&&age <= 28) {
            System.out.println("青年");
        }else if(age >= 29 && age <=55) {
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 2; i < Math.sqrt(a); i++) {
            if(a%i == 0) {
                System.out.println("不是素数");
                return;
            }
        }
        System.out.println("是素数");
    }

    public static void main4(String[] args) {
        int count = 0;
        for(int i = 2; i<=100; i++){
            int j = 2;
            for(; j <= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    break;
                }
            }
            if(j>Math.sqrt(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main5(String[] args) {
        int count = 0;
        for(int i = 1000; i <=2000; i++) {
            if((i%4 == 0 && i%100 != 0)|| (i%400 == 0)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println(count);
    }



}
