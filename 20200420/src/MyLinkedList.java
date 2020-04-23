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
    }


    public void clear(){

    }



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
        int ret = size() - k;
        Node cur = this.head;
        while(ret != 0) {
            cur = cur.next;
            ret--;
        }
        return cur;
    }

}
