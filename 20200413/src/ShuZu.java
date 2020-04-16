import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @Description:
 * @USer:LD
 * @Date: 2020-04-13
 * @time: 20:08
 **/
public class ShuZu {

    public static String myToString(int[] arr){
       String ret = "[";
        for(int i = 0;i < arr.length;i++){
            ret += arr[i];
            if(i != arr.length-1){
                ret += ",";
            }
        }
        ret +="]";
        return ret;
    }
    public static void main5(String[] args) {
        int[] array = {12,34,1,6,2,9,21};
        String ret = myToString(array);
        System.out.println(ret);
    }


    public static int[] func(int[] array){
        int[] tmp = new int [array.length];
        for(int i = 0;i <array.length;i++){
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }
    public static void main4(String[] args) {
        int a = 0;
        System.out.println(a);
        int[] arr = {1,2,3,4,5,6,7};
        int[] ret =  func(arr);
        System.out.println(Arrays.toString(ret));
    }


    public static void main3(String[] args) {
        int num = 0;
        func(num);
        System.out.println("mum = "+num);
    }
    public static void func(int x) {
        x = 10;
        System.out.println("x = "+x);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String ret = Arrays.toString(arr);
        System.out.println(ret);
        printArray(arr);
    }
    public static void printArray(int[] a){
        for(int x: a){
            System.out.println(x);
        }
        System.out.println(a.length);

    }



    public static void main1(String[] args) {
        int[] arr = new int[]{1,2,3};
        //new：实例化一个对象，堆
        int[] arr2 = {1,2,3};
        int[] arr3 = new int[4];
        //数组在堆上
        System.out.println("length = "+arr2.length);
        System.out.println(arr2[1]);
        System.out.println(arr2[0]);
        arr2[2] = 100;
        System.out.println(arr2[2]);
        for(int i = 0;i <arr.length;i++) {
            System.out.println(arr[i]);
        }
         for(int x:arr){
             System.out.println(x);
         }
    }
}
