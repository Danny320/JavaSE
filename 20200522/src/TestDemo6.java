/**
 * Created with Intellij IDEA
 *
 * @program: 20200522
 * @Description:
 * @USer:LD
 * @Date: 2020-05-25 23:55
 * @time: 23:55
 **/
class OuterClass {
    public int data1 = 1;
    public static int data2 = 2;

    //实例内部类：-》可以看做是一个普通的实例数据成员
    class InnerClass {
        public int data1 = 11;
        public int data3 = 3;
        public static final int a = 33;
        public void func() {
            System.out.println(this.data1);
            System.out.println(OuterClass.this.data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
        }
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        //实例化一个内部类
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}
