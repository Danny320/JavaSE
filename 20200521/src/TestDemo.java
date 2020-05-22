import java.util.ArrayList;
import java.util.LinkedList;
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
        // 大顶堆，比较器使用lambda表达式，更简洁
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(k, (o1, o2)->{
            return (o2.get(0) + o2.get(1)) - (o1.get(0) + o1.get(1));
        });

        // 遍历所有可能的集合
        for(int i = 0; i < Math.min(nums1.length, k); i++){
            for(int j = 0; j < Math.min(nums2.length, k); j++){
                // 剪枝，如果当前的两个数之和超过了堆顶元素，由于数组已经排序，后面的元素只会更大，因此无需继续遍历
                if(queue.size() == k && nums1[i]+nums2[j] > queue.peek().get(0) + queue.peek().get(1)){
                    break;
                }

                // 若比堆顶小，则弹出堆顶元素，把当前数对加入
                if(queue.size() == k){
                    queue.poll();
                }
                List<Integer> pair = new ArrayList<>();
                pair.add(nums1[i]);
                pair.add(nums2[j]);
                queue.add(pair);
            }
        }

        // 最后将元素弹出，倒序插入数组即可
        List<List<Integer>> res = new LinkedList<>();
        for(int i =0; i < k && !queue.isEmpty(); i++){
            res.add(0, queue.poll());
        }
        return res;
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
