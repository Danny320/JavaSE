import java.util.Scanner;
public class TestDemo3{

public static void main(String[] args) {
	int n = 5;
	int ret = factor1(n);
	System.out.println("ret = "+ret);
}
public static int factor1(int n){
	if(n==1){
		return 1;
	}
	return n*factor1(n-1);
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