

public class HelloWord{

	public static void main(String[] args) {
		 int num1 = 10;
		 System.out.println(num1);
		 System.out.println(Integer.MAX_VALUE);
		 System.out.println(Integer.MIN_VALUE);
		 long num2 = 10l;
         System.out.println(num2);
         System.out.println(Long.MAX_VALUE);
         System.out.println(Long.MIN_VALUE);
         double num3 =1.0;
         System.out.println(num3);
         String a="hello";
         String b="world";
         String c=a+b;
         System.out.println(c);
         String greeting ="hello";
         String s=greeting.substring(0,3);
         System.out.println(s);
         String expletive ="Expletive";
         String PG13 ="deleted";
         String message =expletive+PG13;
         System.out.println(message);
         int age = 13;
         String rating ="PG"+age;
         System.out.println(rating);
         System.out.println("as"+10);
         greeting =greeting.substring(0,3)+"p !";
         System.out.println(greeting);
         
      
	}
}