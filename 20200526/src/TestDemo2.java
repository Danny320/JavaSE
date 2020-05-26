/**
 * Created with Intellij IDEA
 *
 * @program: 20200526
 * @Description:
 * @USer:LD
 * @Date: 2020-05-26 19:03
 * @time: 19:03
 **/
//泛型类
class Generic<T extends Comparable<T>> {
    public  T findMax(T[] array) {
        T max = array[0];
        for(int i = 1; i < array.length;i++) {
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
class Generic2 {
    //泛型静态方法
    public  static<T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for(int i = 1; i < array.length;i++) {
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

/**
 * 根据实参类型推导出形参的类型
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Integer[] array = {12,3,6,23,56,9};
        System.out.println(Generic2.findMax(array));
    }

    public static void main1(String[] args) {
        Generic<Integer> generic = new Generic<>();
        Integer[] array = {12,3,6,23,56,9};
        System.out.println(generic.findMax(array));
    }
}
