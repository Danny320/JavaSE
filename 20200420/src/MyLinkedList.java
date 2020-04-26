import java.security.PublicKey;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200420
 * @Description:
 * @USer:LD
 * @Date: 2020-04-20 18:57
 * @time: 18:57
 **/
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}


public class MyLinkedList {
    public  Node head;//保存单链表的头结点的引用 null

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        head = node;
    }


    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = head;
        if(this.head ==null) {
            this.head = node;
            return;
        }
        while(cur != null) {
            cur = cur.next;
        }
        cur.next = node;
    }


    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;


    }
    private Node searchIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index位置不合法");
        }

        int count = 1;
        Node cur = this.head;
        while(count < index) {
            cur = cur.next;
            count++;
        }
        return cur;
    }


     //查找是否包含关键字key是否在单链表当中
     public boolean contains(int key){
        Node cur = this.head;

        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null) {
            return;
        }
        //删除的是不是头结点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找到删除节点的前驱
        Node prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有这个节点");
            return;
        }
        //开始删除
        prev.next = prev.next.next;
    }
    private Node searchPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            } else {
                prev = prev.next;
            }
        }
        return null;
    }



    //删除所有值为key的节点
    public Node removeAllKey(int key){
        if(this.head == null) {
            return null;
        }
        Node cur = head.next;//代表要删除的节点
        Node prev = this.head;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
        return head;
    }


    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    //打印链表
    public void display(){
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

   /**
    *释放内存的。
    */
    public void clear(){this.head = null;}


    //找中间位置的节点
    public Node middleNode() {
        int prev = size()/2;
        Node cur = this.head;
        while (prev != 0) {
            cur = this.head.next;
            prev--;
        }
        return cur;
    }
    public Node middleNode2() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }



    //找倒数第K个节点
    public Node FindKthToTail(int k) {
        Node fast = this.head;
        Node slow = this.head;
        while(k-1 > 0) {
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else {
                System.out.println("k的值不合法！");
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    //判断链表中是否有环
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                    break;
            }
        }
        if(fast != null && fast.next != null) {
            return false;
        }else {
            return true;
        }
    }

    //返回环的入口位置
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast != null && fast.next != null) {
            return null;

        }
        slow = this.head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }



    public void display2(Node newHead) {
        Node cur = newHead;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }



    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                //第一次插入
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                //第一次插入
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空  如果bs == null 返回as
        if(bs == null) {
            return as;
        }
        //2、如果bs不为空  需要进行拼接
        be.next = as;
        //3、如果ae不为空    ae的next需要置为空
        if(ae != null) {
            ae.next = null;
        }
        return bs;
    }

    //删除重复节点
    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }



    //判断是否是回文结构
    public boolean chkPalindrome() {
        //单链表为空不是回文结构
        if(this.head == null) {
            return false;
        }
        //单链表只有头结点必为回文结构
        if(this.head.next == null) {
            return true;
        }
        //1，找到单链表的中间节点
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2,反转单链表的后半部分
        Node cur = slow.next;
        if (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //slow是最后一个节点了
        //3，开始一个从头走一个从尾走
        while (slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }
            //判断偶数的情况
            if(this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
}
