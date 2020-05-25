/**
 * Created with Intellij IDEA
 *
 * @program: 20200522
 * @Description:
 * @USer:LD
 * @Date: 2020-05-25 23:51
 * @time: 23:51
 **/
class Animal {
    public void func(){
        System.out.println("Animal::func()");
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        //重写内部类
        new Animal(){
            public void func(){
                System.out.println("我重写了这个方法");
            }
        }.func();
    }
}
