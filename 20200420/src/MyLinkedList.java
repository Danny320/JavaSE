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
        Node cur = this.head;
        if(cur.data == key) {
            head = cur.next;
            return;
        }
        while (cur != null) {
            cur = cur.next;
        }
        while (cur.data == key) {

        }
    }


    //删除所有值为key的节点
    public void removeAllKey(int key){

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


    public void display(){
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }


    public void clear(){

    }

}
