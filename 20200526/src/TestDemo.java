/**
 * Created with Intellij IDEA
 *
 * @program: 20200526
 * @Description:
 * @USer:LD
 * @Date: 2020-05-26 18:34
 * @time: 18:34
 **/
class OuterClass implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int data1 = 1;
    public static int data2 = 2;

    /**
     * 静态内部类当中 不能访问外部类的非静态的数据成员
     *
     *
     *
     */
        static class InnerClass {
        public int data1 = 11;
        public int data3 = 3;
        public static final int a = 33;
        public OuterClass out;
        public InnerClass(OuterClass out) {
            this.out = out;
        }

        public void func() {
            System.out.println(this.data1);
            System.out.println(this.out.data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
        }
    }
}
public class TestDemo {



    public static void main2(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(outerClass);
        innerClass.func();
    }
    public static void main1(String[] args) {
//        OuterClass outerClass = new OuterClass();
//        //实例化一个内部类
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        innerClass.func();
    }
}
