/**
 * Created with Intellij IDEA
 *
 * @program: 20200419
 * @Description:
 * @USer:LD
 * @Date: 2020-04-19 21:40
 * @time: 21:40
 **/

class MyValue {
    private int Val;

    public void setVal(int val) {
        Val = val;
    }

    public int getVal() {
        return Val;
    }

}
    public class TestDemo2 {
    public static void swap(MyValue myValue1,MyValue myValue2){
        int tmp = myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(tmp);
    }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.setVal(10);
        myValue2.setVal(20);
        System.out.println("交换前：");
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        swap(myValue1,myValue2);
        System.out.println("交换后：");
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }
}
