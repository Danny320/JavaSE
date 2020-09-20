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

//水仙花数
    public static void main6(String[] args) {
        for(int i = 0; i <1000; i++) {
            int count = 0;
            int tmp = i;
            while(tmp != 0) {
                tmp /= 10;
                count++;
            }
            tmp = i;
            int sum = 0;
            while(tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if(sum == i) {
                System.out.print(sum + " ");
            }
        }
    }

    //计算分数的值
    public static void main7(String[] args) {
        double i = 0.0;
        double sum = 0.0;
        int flag = -1;
        for( i = 1.0; i < 100.0; i++) {
            flag = -flag;
            sum += (1/i)*flag;
        }
        System.out.println(sum);
    }


    //求两个数的最大公约数
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = a>b?b:a;
        while (a%b != 0) {
            tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println("最大公约数为;"+tmp);
    }


    //求一个整数，在内存当中存储时，二进制1的个数
    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if(((n>>i)&1)==1) {
                count++;
            }
        }
        System.out.println(count);
    }


    //获取一个二进制序列中所有的偶数位和奇数位，分别输出二进制序列
    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =30; i>=0; i-=2) {
            int tmp = (num>>i)&1;
            System.out.print(tmp);
        }//偶数位
        System.out.println();
        for(int i = 31; i>=1; i-=2) {
            int tmp = (num>>i)&1;
            System.out.print(tmp);
        }
    }


    //输出一个整数的每一位
    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n) {
        if(n >9) {
            print(n/10);
        }
        System.out.println(n%10);
    }


    //输出乘法口诀表
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        for(int i = 1; i<line; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
