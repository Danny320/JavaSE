import java.util.Scanner;
import java.util.Random;
public class TestDemo2{
public static void main14(String[] args) {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	int toGess = random.nextInt(100);
	while(true){
		System.out.println("请输入你要猜的数字：（1-100）");
		int sssssnum = sc.nextInt();
		if(num<toGess){
			System.out.println("猜小了");
 		}
 		else if (num>toGess) {
			System.out.println("猜大了");
 		}
 		else{
			System.out.println("猜对了");
			break;
 		}
	}
	sc.close();
}



public static void main13(String[] args) {
	Scanner n = new Scanner(System.in);
	int num = n.nextInt();
	int i = 0;
	for(i = 31;i>=0;i--){
		int tmp = (num>>i)&1;
		System.out.print(tmp);
	}
}



public static void main12(String[] args) {
	Scanner n = new Scanner(System.in);
	int num = n.nextInt();
	n.close();
	for(int i = 30;i>=0;i-=2){
		int tmp = (num>>i)&1;
		System.out.print(tmp);
	}//偶数位
	System.out.println("\n");
	for(int i = 31;i>0;i-=2){
		int tmp = (num>>i)&1;
		System.out.print(tmp);
	}//奇数位
}



	public int b(int m){
		int i = 0;
		int count = 0;
		for(i=0;i<32;i++){
			if(((m>>i)&1)==1){
				count++;
			}
		}
		return count;
	}

public static void main11(String[] args) {
	TestDemo2 Bit = new TestDemo2();
	int m = 14;
	int sum = Bit.b(m);
	System.out.println(sum);
}


public static void main10(String[] args) {
	int i = 3;
	while(i>0){
		Scanner num = new Scanner(System.in);
		System.out.println("请输入密码：");
		String number = num.nextLine();
		if("123456"==number){
			System.out.println("密码正确");
			break;
		}
		else{
			System.out.println("密码错误，请重新输入");
		}
		i--;
	}	
}


public static void main9(String[] args) {
	int i = 1;
	int count = 0;
	for(i = 1;i<=100;i++){
		if(i%10==9){
			count++;
		}
		if(i/10==9){
			count++;
		}
	}
	System.out.println("count="+count);
}


public static void main8(String[] args) {
	double i = 1.0;
	double sum = 0.0;
	for(i = 1.0;i<=100.0;i++){
       if(i%2!=0){
       	sum+=1/i;
       }
       else{
       	sum-=1/i;
       }
	}
	System.out.println(sum);
}


public static void main7(String[] args) {
	double i = 1.0;
	double sum = 0.0;
	int flag = -1;
	for(i = 1.0;i<=100.0;i++){
        flag = -1*flag;
		sum+=((1/i)*flag);
	}
	System.out.println("sum="+sum);
}


public static void main6(String[] args) {
	int a = 8;
	int b = 24;
	while(a%b!=0){
		int tmp = a%b;
		a = b;
		b = tmp;
	}
	System.out.println("最大公约数为："+b);
}


public static void main5(String[] args) {
int line = 9;
for(int i = 1;i<=line;i++){
	for(int j=1;j<=i;j++){
		System.out.print(j);
		System.out.print("*");
		System.out.print(i);
		System.out.print("=");
		System.out.print(i*j+"  ");
	}
		System.out.print("\n");
}
}


public static void main4(String[] args) {
	int i = 1000;
	int count = 0;
	for(i = 1000;i <= 2000;i++){
		if((i%4==0&&i%100!=0)||(i%400==0)){
			System.out.print(i+" ");
			count++;
		}
	}
		System.out.println("count="+count);

}


public static void main3(String[] args) {
        	System.out.println(1);
        	int count = 1;
	for(int n = 1;n<=100;n++){
		int i = 0;
		for( i = 2; i < n; i++){
            if(n%i == 0){
        	break;
            }
        }
        if(i==n){
        	System.out.print(n);
        	System.out.print(" ");
        	count++;
        }
	}
        	System.out.println("count="+count);

}


public static void main2(String[] args) {
	int n = 22;
	int i = 0;
	    for(i = 2; i < n; i++){
            if(n%i == 0){
        	break;
            }
	    }
	if(i==n){
	    	System.out.println("是素数");
    }
    else
	    	System.out.println("不是素数");
}


	public static void main1(String[] args) {
		int age = 23;
		System.out.println(age);
		if(age <= 18){
			System.out.println("当前年龄是：少年");
		}
			else if((age >= 19)&&(age <= 28)){
			System.out.println("当前年龄是：青年");
		}
			else if((age >= 29)&&(age <= 55)){
			System.out.println("当前年龄是：中年");
		}
		else{
			System.out.println("当前年龄是：老年");
		}
	}
}