import java.util.Arrays;
import java.util.Scanner;
public class TestDemo3{

	public static void main12(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		swap1(array);
		String ret = Arrays.toString(array);
		System.out.println(ret);
	}
	public static void swap1( int arr[]){
		int len = arr.length;
		int left = 0;
		int right = len-1;
		while(left < right){
			while(left < right && arr[left]%2 != 0){
				left++;
			}
			while(left < right && arr[right]%2 == 0){
				right--;
			}
			if(left < right){
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
			}
		}
	}


public static void main11(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num4 = sc.nextInt();
	int ret5 = fib(num4);
	System.out.println(ret5);
}
public static int fib(int num4){
	int last1 = 1;
	int last2 = 1;
	int cur = 1;
	for(int i = 3;i <= num4;i++){
		cur = last1 + last2;
		last1 = last2;
		last2 = cur;
	}
	return cur;
}



public static void main10(String[] args) {
	int num3 = 1729;
	int ret4 = sum1(num3);
	System.out.println(ret4);
}
public static int sum1(int num3){
	if(num3 < 10){
		return num3; 
	}
	return num3 % 10 + sum1(num3 / 10);
}



public static void main9(String[] args) {
	int num2 = 10;
	int ret3 = sum(num2);
	System.out.println(ret3);
}
public static int sum(int num2){
	if(num2 == 1){
		return 1; 
	}
	return num2+sum(num2-1);
}


public static void main8(String[] args) {
	int num1 = 1234;
	 print(num1);
}
public static void print(int num1) {
	if(num1 > 9) {
		print(num1 / 10);
	}
	System.out.println(num1 % 10);
}



public static void main7(String[] args) {
	int a = 10;
	int b = 20;
	int ret = add1(a,b);
	System.out.println(ret);

	double a2 = 10.5;
    double b2 = 20.5;
    double ret2 = add1(a2,b2);
	System.out.println(ret2); 
}
public static int add1(int x,int y){
	return x + y;
}
public static double add1(double x,double y){
	return x + y;
}



public static void main6(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int ret = factor1(n);
	System.out.println("ret = "+ret);
}
public static int factor1(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++) {
		sum+=factor2(i);
	}
	return sum;
}
public static int factor2(int n){
	if(n == 1){
		return 1;
	}
	return n*factor2(n-1);
}



	public static void main5(String[] args) {
		int arr[] = {10,20};
		swap(arr);
		System.out.println("a = "+arr[0]+"b = "+arr[1]);
	}
	public static void swap(int arr[]){
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
	}


public static void main4(String[] args) {
	int sum = 0;
	for(int i = 1;i <= 5; i++){
		sum += factor(i);
	}
System.out.println("sum = "+sum);
}
public static int factor(int n){
	System.out.println("计算 n 的阶乘中！ n = "+n);
	int result = 1;
	for(int i = 1;i <= n;i++){
		result*= i;
	}
	return result;
}


	public static void main3(String[] args) {
		int a = 10;
		int b = 20;
		//方法调用
		int ret = add(a,b);
		System.out.println("ret = "+ret);
	}
	public static int add(int x,int y){
		return x + y;
	}

public static void main2(String[] args) {
	int i= 1;
	for(;;){
		if(i<= 10){
			System.out.println(i);
			i++;
		}
	}
}


	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num<=20){
			if(num%15==0){
				System.out.println(num);
				//break;
				continue;
			}
			System.out.println("hhhhh");
			num++;
		}
	}
}