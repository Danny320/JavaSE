import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200530
 * @Description:
 * @USer:LD
 * @Date: 2020-05-30 18:35
 * @time: 18:35
 **/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums1.length < nums2.length) {
            return intersect(nums2,nums1);
        }
        for (int i = 0; i < nums1.length; i++) {
            if(!map.containsKey(nums1[i])) {
                map.put(nums1[i],1);
            }else {
                int v = map.get(nums1[i]);
                map.put(nums1[i],v+1);
            }
        }
        int k = 0;
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) &&map.get(nums2[i]) != 0) {
                nums1[k] = nums2[i];
                k++;
                int v = map.get(nums2[i]);
                map.put(nums2[i],v-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }


    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n: nums1) {
            set1.add(n);
        }
       HashSet<Integer> set2 = new HashSet<>();
        for (int num:nums2) {
            if(set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] arr = new int[set2.size()];
        int i = 0;
        for (int n:set2) {
            arr[i] = n;
            i++;
        }
        return arr;
    }


    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arrs = s.toCharArray();
        for (char ch:arrs) {
            if(!map.containsKey(ch)) {
                map.put(ch,1);
            }else {
                int v = map.get(ch);
                map.put(ch,v+1);
            }
        }
        for (int i = 0; i < arrs.length;i++) {
            if(map.get(arrs[i]) == 1) {
                return i;
            }
        }
        return -1;
    }



    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        k = Math.min(k,nums1.length*nums2.length);
         Queue<int[]> queue = new PriorityQueue<>(k, new Comparator<int[]>() {
             @Override
             public int compare(int[] o1, int[] o2) {
                 return o2[0] + o2[1] - o1[0] - o1[1];
             }
         });
        List<List<Integer>> list = new ArrayList<>();
        if(k == 0) {
            return list;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(queue.size() < k) {
                    queue.offer(new int[]{nums1[i],nums2[j]});
                }else if((nums1[i] + nums2[j]) <= (queue.peek()[0] + queue.peek()[1])){
                    queue.poll();
                    queue.offer(new int[]{nums1[i],nums2[j]});
                }
            }
        }
        while (k > 0) {
            int[] tmp = queue.poll();
            list.add(Arrays.asList(tmp[0],tmp[1]));
            k--;
        }
        return list;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};

        Solution solution = new Solution();
        System.out.println( solution.kSmallestPairs(nums1,nums2,3));
    }
}
