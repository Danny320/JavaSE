import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @Description:
 * @USer:LD
 * @Date: 2020-04-15
 * @time: 18:36
 **/
public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ret = copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyOf(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length;i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }


    public static void main9(String[] args) {
        int[] arr = new int[100];
        for (int i = 0;i < arr.length;i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main8(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main7(String[] args) {
        int[] arr = {1,2,3};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            arr[i] *= 2;
        }
    }



    public static void main6(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("平均值为："+avg(arr));
    }
    public static double avg(int[] arr) {
        int sum = 0;
        int i = 0;
        while(i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }



    public static void main5(String[] args) {
        int[] arr = {9,12,8,5,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        int i = 0;
        boolean flag = true;
        for(i = 0;i < arr.length-1;i++){
            flag = true;
            for(int j = 0;j < arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    flag = false;
                }
            }
            if(flag == true){
                break;
            }

        }
    }


    public static void main4(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(isup(arr));
    }
    public  static boolean isup(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;

    }



    public static void main3(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(binarySeach(arr,6));
    }
    public static int binarySeach(int[] arr,int toFind){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(toFind < arr[mid]) {
                right = mid - 1;
            }else if(toFind > arr[mid]){
                left = mid + 1;
            }else {
                return  mid;
            }
        }
        return  -1;
    }



    public static void main2(String[] args) {
        int[] array = {12,78,18,24,13};
        int ret = findMax(array);
        System.out.println(ret);
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
       int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyArray(int[] array) {
        int[] array2 = new int[array.length];
        for(int i = 0;i <array.length;i++){
            array2[i] = array[i];
        }
        return array2;

    }
}
