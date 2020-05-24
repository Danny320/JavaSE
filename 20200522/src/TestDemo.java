import java.util.Arrays;
import java.util.Stack;

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


    public static int partition(int[] array,int low,int high) {
        int tmp = array[low];
        while (low < high) {
           while (low < high && array[high] >= tmp) {
               high--;
           }
           array[low] = array[high];
           while (low < high && array[low] <= tmp) {
               low++;
           }
            array[high] = array[low];
        }
        array[high] = tmp;
        return high;
    }

    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }

       int par = partition(array,left,right);
        quick(array,left,par-1);
        quick(array,par+1,right);
    }
    //时间复杂度：nlogn
    //空间复杂度：logn
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void three_num_mid(int[] array,int left,int right) {
        //array[mid] <= array[left] <= array[high]
        int mid = (left+right)/2;
        if(array[mid] > array[right]) {
            swap(array,mid,right);
        }
        if(array[mid] > array[left]) {
            swap(array,mid,left);

        }
        if(array[left] > array[right]) {
            swap(array,left,right);
        }
    }
    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }



    public static void quickSort1(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length-1;

        int par = partition(array,left,right);
        if(par > left+1) {
            stack.push(par-1);
            stack.push(left);

        }
        if(par < right-1) {
            stack.push(right);
            stack.push(par+1);
        }

       while (!stack.empty()) {
           left = stack.pop();
           right = stack.pop();
           par = partition(array,left,right);
           if(par > left+1) {
               stack.push(par-1);
               stack.push(left);

           }
           if(par < right-1) {
               stack.push(right);
               stack.push(par+1);
           }
       }
    }



    //归并排序
    public static void mergeSort(int[] array) {
        int low = 0;
        int high = array.length-1;
        mergeSortInternal(array,low,high);
    }
    public static void mergeSortInternal(int[] array,int low,int high) {
        //分解
        if(low >= high) {
            return;
        }
        int mid = (low+high)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }
    //归并
    public static void merge(int[] array,int low,int mid,int high) {
        int s1 = low;
        int s2 = mid+1;
        int len = high-low+1;
        int[] ret = new int[len];
        int i = 0;//
        while (s1 <= mid &&s2 <=high) {
            if(array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            }else {
                ret[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            ret[i++] = array[s1++];

        }
        while (s2 <= high) {
            ret[i++] = array[s2++];
        }
        for (int j = 0; j < ret.length; j++) {
            array[j+low] = ret[j];
        }
    }


    public static void main(String[] args) {
        int[] array = {4,6,1,3,8,2,9,5};
//        shellSort(array);
//        System.out.println(Arrays.toString(array));
//        quickSort(array);
////        System.out.println(Arrays.toString(array));
//        quickSort1(array);
//        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
