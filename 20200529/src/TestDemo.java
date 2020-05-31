import java.util.HashMap;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200529
 * @Description:
 * @USer:LD
 * @Date: 2020-05-29 19:48
 * @time: 19:48
 **/
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(char ch:s1) {
            if(!map1.containsKey(ch)){
                map1.put(ch,1);
            }else {
                int v = map1.get(ch);
                map1.put(ch,v+1);
            }
        }
        for(char ch:t1) {
            if(!map2.containsKey(ch)){
                map2.put(ch,1);
            }else {
                int v = map2.get(ch);
                map2.put(ch,v+1);
            }
        }
        int i = 0;
        for( ; i< t.length();i++) {
            char ch = t.charAt(i);
            if(map1.get(ch) != map2.get(ch)) {
                break;
            }
        }
        return t.charAt(i);
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && Math.abs(i-j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n: nums) {
            if(!map.containsKey(n)) {
                map.put(n,1);
            }else {
                int v = map.get(n);
                map.put(n,v+1);
            }
        }
        for (int n:nums) {
            if(map.get(n) >= 2) {
                return true;
            }
        }
        return false;
    }
}
class HashBuck {

    static class Node {
        public int key;
        public int val;
        public Node next;
        public Node(int key,int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array = new Node[10];
    public int usedSize;

    public void put(int key,int val) {
        int index = key % array.length;
        for (Node cur = array[index];cur != null;cur = cur.next) {
            if(cur.key == key) {
                //key相同 更新val值
                cur.val = val;
                return;
            }
        }
        Node node = new Node(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        if(loadFactor() > 0.75) {
            resize();
        }

    }

    public void resize() {
        Node[] newArray = new Node[2*this.array.length];
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];
            while (cur != null) {
                Node curNext = cur.next;
                int index = cur.key%newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
                cur = curNext;
            }
        }
        array = newArray;
    }

    public double loadFactor(){
        return this.usedSize*1.0 / this.array.length;
    }


    public int get(int key) {
        int index = key%array.length;
        Node cur = array[index];
        while (cur != null) {
            if(cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        for (int i = 1; i < 8; i++) {
            hashBuck.put(i,i);
        }
        hashBuck.put(11,101);
        System.out.println(hashBuck.get(11));


        HashMap<Character,Integer> map = new HashMap<>();

    }
}
