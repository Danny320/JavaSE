
public class TestDemo{

	
public static void main(String[] args) {
	long a = 10L;
	int b = (int)a;
	System.out.println(b);
	int num1 = 10;
	//String str1=num+"";
	String str2 = String.valueOf(num1);//
	String str = "100";
	int num=integer.parseInt(num);
}



public static void main11(String[] args) {
	final int MAXNUM;
	MAXNUM=999;
	System.out.println(MAXNUM);
}



public static void main10(String[] args) {
	byte b = 10;
	byte c = 20;
	byte d = (byte)(b+c);
	System.out.println(d);
}



public static void main9(String[] args) {
	String str = "\\\\hello\\\\";
    System.out.println(str);	

}



public static void main8(String[] args) {
    boolean flg = true;
    System.out.println(flg);	
}


public static void main7(String[] args) {
	short sh =12;
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);
}


public static void main6(String[] args) {
	byte b = 12;
	byte c = 21;
	System.out.println(b+""+c);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE+1);
	byte d = 127;
}


public static void main5(String[] args) {
	char ch = 'a';
	System.out.println(ch);
	char ch1 = '罗';
	System.out.println(ch1);
	char ch2 = 97;
	System.out.println(ch2);
}


public static void main4(String[] args) {
	float f = 12.3f;
	System.out.println(f);
}


	public static void main3(String[] args) {
		double d =12.5;//小数默认双精度类型
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

        int a = 1;
        int b = 2;
        System.out.println(a/b);
        double num = 1.1;
        System.out.println(num*num);
        //System.out.println("",num*num);
	}


	public static void main2(String[] args) {
		
		for(int i = 0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
			System.out.println("haha");
	}


	public static void main1(String[] args) {
    long a =10L;
    System.out.println("a的值是："+a);
    System.out.println("最大值："+Long.MAX_VALUE);
    System.out.println("最小值："+Long.MIN_VALUE);

    int b=10;
    int c=20;
    System.out.println(b+c);
    //任何类型的数据和字符串进行拼接结果就是字符串；
    System.out.println("haha"+b+c);
	}
}