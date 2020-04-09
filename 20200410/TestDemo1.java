public class TestDemo1{
public static void main(String[] args) {
	int num = 5;
	int i = 1;
	int ret = 1;
	int sum=0;
	while(i<=5){
		ret*=i;
		sum+=ret;
		i++;
	}
	System.out.println(sum);
}


public static void main4(String[] args) {
	int num = 10;
	if(num > 0){
		System.out.println("num 是正数");
	}else if (num < 0) {
		System.out.println("num 是负数");
	}else{
		System.out.println("num 是 0");
	}
}


public static void main3(String[] args) {
	int num = 10;
	if(num % 2 == 0){
		System.out.println("num 是偶数");
	}
	else  {
		System.out.println("num 是奇数");
	}
}


	public static void main2(String[] args) {
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println((float)5/2);
		//System.out.println(float 5/2);
		
	}



	public static void main1(String[] args) {
		System.out.println(10%3);
		System.out.println(-10%3);
		System.out.println(10%-3);
		System.out.println(-10%-3);
	}
}