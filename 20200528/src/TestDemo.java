import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200528
 * @Description:
 * @USer:LD
 * @Date: 2020-05-28 15:04
 * @time: 15:04
 **/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Car {
    int position;
    double time;

    public Car(int position, double time) {
        this.position = position;
        this.time = time;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        Car[] cars = new Car[len];
        for(int i = 0; i < len; i++) {
            cars[i] = new Car(position[i],(double)(target-position[i])/speed[i]);
        }
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.position - o1.position;
            }
        });
        int ret = 0;
        return 0;
    }
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Node cur = head;
        Map<Node,Node> map = new HashMap<>();
        while (cur != null) {
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
    public int numJewelsInStones(String J, String S) {
        List<Character> list = new ArrayList<>();
        char[] j = J.toCharArray();
       for(int i = 0; i < j.length; i++) {
           list.add(j[i]);
       }
        char[] s = S.toCharArray();
       int ret = 0;
        for(int i = 0; i < s.length; i++) {
            if(list.contains(s[i])) {
                ret++;
            }
        }
        return ret;
    }

}
public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();//7_This_is_a_test
        String actual = scanner.nextLine();//_hs_s_a_es

        //1、把实际的字符转换为大写存放到集合当中
        HashSet<Character> setActual = new HashSet<>();
        for (char s : actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }
        HashSet<Character> setBroken = new HashSet<>();
        for (char ex : expected.toUpperCase().toCharArray()) {
          if(!setActual.contains(ex)&&!setBroken.contains(ex)) {
              System.out.print(ex);
              setBroken.add(ex);
          }
        }

    }

    public static void main1(String[] args) {

    }
}
