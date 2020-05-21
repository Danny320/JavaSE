import java.util.List;
import java.util.PriorityQueue;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200521
 * @Description:
 * @USer:LD
 * @Date: 2020-05-21 18:34
 * @time: 18:34
 **/

public class TestDemo {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer[]> num11 = new PriorityQueue<>();
        for(int i = 0; i < nums1.length; i++) {

        }




    }

    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        List<List<Integer>> ret = kSmallestPairs(nums1,nums2,3);
        System.out.println(ret);

    }
    public static void main2(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.push(80);
        testHeap.show();
        testHeap.pop();
        testHeap.show();
        System.out.println("排序：");
        testHeap.heapSort();
        testHeap.show();
    }


    public static void main1(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        System.out.println(priorityQueue);

    }
}
