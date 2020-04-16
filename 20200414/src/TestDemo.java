import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @Description:
 * @USer:LD
 * @Date: 2020-04-14
 * @time: 21:43
 **/
public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {1,3,5,1,6,6,3,7,5};
        int ret = findNotDouble(arr);
        System.out.println(ret);
    }
    public static int findNotDouble(int[] arr) {
        int result = arr[0];
        for (int i = 1;i < arr.length;i++) {
            result ^= arr[i];
        }
        return result;
    }



    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum = "+sum(n));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n +sum(n-1);
    }


    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        func(num);
    }
    public static void func(int n){
        if(n > 9){
             func(n/10);
        }
        System.out.println(n%10);
    }


    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }
    public static int fib(int n){
        if(n <= 2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }


    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+"+"+b+"="+sum(a,b));
        System.out.println("请输入三个小数：");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        System.out.println(a2+"+"+b2+"+"+c2+"="+sum(a2,b2,c2));
    }
    public static int sum(int x,int y){
        return x + y;
    }
    public static double sum(double x,double y,double z){
        return x + y + z;
    }



        public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("最大值为："+max(a,b));
        System.out.println("请输入两个小数：");
        double a1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        System.out.println("最大值为："+max(a1,b2));
        System.out.println("请输入两个小数和一个整数：");
        double a3 = sc.nextDouble();
        double b3 = sc.nextDouble();
        int c3 = sc.nextInt();
        max(a3,b3,c3);
        sc.close();

    }
    public static int max(int x,int y){
        return x > y ? x :y;
    }
    public static double max(double x,double y){
        return x > y ? x : y;
    }
    public  static void max(double x,double y,int z){
       double tmp = x > y ? x :y;
       double max = tmp > z ? tmp : z;
       double tmp1 = x < y ? x : y;
       double min = tmp1 < z ? tmp :z;
       double mid = (x+y+z*1.0)-max-min;
       System.out.println(max + ">" + mid + ">" + min);
    }


    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int ret = max2(a,b);
        int ret2 = max3(a,b,c);
        System.out.println(ret);
        System.out.println(ret2);
    }
    public static int max2(int x, int y){
        return x > y ? x : y;
    }
    public static int max3(int x, int y,int z){
        return max2(x,y) > z ? max2(x,y) : z;
    }

}
