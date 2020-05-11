/**
 * Created with Intellij IDEA
 *
 * @program: 20200510
 * @Description:
 * @USer:LD
 * @Date: 2020-05-10 09:03
 * @time: 09:03
 **/
public class TestDemo {



    public static void main(String[] args) {
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了空指针异常");
        }
        System.out.println("hello");
    }
}
