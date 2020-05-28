import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200526
 * @Description:
 * @USer:LD
 * @Date: 2020-05-26 22:25
 * @time: 22:25
 **/
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length;i++) {
            if(!map.containsKey(words[i])) {
                map.put(words[i],1);
            }else {
                int v = map.get(words[i]);
                map.put(words[i],v+1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (map.get(o1).equals(map.get(o2))) {
                            return o1.compareTo(o2);
                        } else {
                            return map.get(o2) - map.get(o1);
                        }
                    }
                }
        );
        return list.subList(0,k);
    }


    public int compareVersion(String version1, String version2) {
      String[] s1 = version1.split("\\.");
      String[] s2 = version2.split("\\.");
      for(int i = 0; i <Math.max(s1.length,s2.length); i++) {
          int a = ( i < s1.length ? Integer.valueOf(s1[i]): 0);
          int b = ( i < s2.length ? Integer.valueOf(s2[i]): 0);
          if(a < b) {
             return -1;
          }else if (a > b) {
              return 1;
          }
      }
      return 0;
    }


    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < arr.length;i++) {
            ret.add(arr[i]);
        }
        ret.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
              return Math.abs(o1-x)-Math.abs(o2-x);
            }
        });
        List<Integer> tmp = ret.subList(0,k);
        tmp.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return tmp;
    }
}
public class TestDemo5 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Solution solution = new Solution();
        List<Integer> list = solution.findClosestElements(arr,4,5);
        System.out.println(list);
    }

    public static void main2(String[] args) {
        String[] s1 ={"i", "love", "leetcode", "i", "love", "coding"};
        Solution solution = new Solution();
       System.out.println( solution.topKFrequent(s1,2));

    }
    public static void main1(String[] args) {
        String s1 = "1";
        String s2 = "0";
        Solution solution = new Solution();
       System.out.println( solution.compareVersion(s1,s2));
    }

}
