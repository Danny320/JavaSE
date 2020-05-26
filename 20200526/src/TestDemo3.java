import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200526
 * @Description:
 * @USer:LD
 * @Date: 2020-05-26 20:28
 * @time: 20:28
 **/

public class TestDemo3 {
    //找到list当中第一个重复的数据
    public static int func(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size();i++) {
            if(set.contains(list.get(i))) {
                return list.get(i);
            }
            set.add(list.get(i));
        }
        return -1;
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val:nums) {
            if(set.contains(val)) {
                set.remove(val);
            }else {
                set.add(val);
            }
        }
        return set.iterator().next();
    }
    public static void main3(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10_0000;i++) {
            list.add(random.nextInt(6000));
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        //key -->关键字重复的数字
        //value -->重复的数字出现的次数
        for (Integer key:list) {
            if(map.get(key) == null) {
                map.put(key,1);
            }else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
    }


    public static void main2(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10_0000;i++) {
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val:list) {
            set.add(val);
        }
    }

    public static void main1(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10_0000;i++) {
            list.add(random.nextInt(6000));
        }
        int ret = func(list);
        System.out.println(ret);
    }
}
