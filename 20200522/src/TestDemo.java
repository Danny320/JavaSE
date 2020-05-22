import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200522
 * @Description:
 * @USer:LD
 * @Date: 2020-05-22 18:36
 * @time: 18:36
 **/
public class TestDemo {

    /**
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     * @param array
     */
    //冒泡排序
    public static void bubbleSort(int[] array) {
        boolean flag = false;
        for(int i = 0; i < array.length-1; i++) {
             flag = false;
            for (int j = 0; j < array.length-1-i;j++) {
                if(array[j] >array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(flag == false) {
                return;
            }
        }
    }


    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            if (child + 1 < len && array[child] < array[child+1]) {
                child++;
            }
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }
    public static void creatHeap(int[] array) {
        for (int i = (array.length-1-1)/2;i >= 0; i++) {
            adjustDown(array,i,array.length);
        }
    }

    /**
     * 时间复杂度：O(nlogn)   不管有序还是无序都是
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    //堆排
    public static void heapSort(int[] array) {
        creatHeap(array);
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }



    /**
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定排序
     * @param array
     */
    //时间复杂度：O(n^2)
    //空间复杂度：O(1)
    //选择排序
    public static void selectSort(int[] array) {
        for(int i = 0;i < array.length; i++) {
            for (int j = i+1; j <array.length; j++) {
                if(array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }


    //希尔排序
    public static void shell(int[] array,int gap) {
        int tmp = 0;
        for(int i = gap;i < array.length; i++ ){
            //有序区间：[0,i)
            //无序区间：[i,array.length)
            tmp = array[i];// 无序区间的第一个数
            int j = 0;
            for( j = i-gap;j >= 0; j-=gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    //array[j+1] = tmp;
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length;i++) {
            shell(array,drr[i]);
        }
    }


    //直接插入排序
    public static void insertSort(int[] array) {
        int tmp = 0;
        for(int i = 1;i < array.length; i++ ){
            //有序区间：[0,i)
            //无序区间：[i,array.length)
            tmp = array[i];// 无序区间的第一个数
            int j = 0;
            for( j = i-1;j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {4,6,1,3,8,2,9,5};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
