/**
 * Created with Intellij IDEA
 *
 * @program: 20200420
 * @Description:
 * @USer:LD
 * @Date: 2020-04-20 18:38
 * @time: 18:38
 **/
public class TestDemo {

    //判断两个链表是否相交
    public static Node getIntersectionNode(Node headA,Node headB) {
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;

        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        int len = lenA-lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for (int i = 0;i< len ;i++) {
            pl = pl.next;
        }
       while (ps != pl) {
           ps = ps.next;
           pl = pl.next;
       }
       if(pl != null) {
           return pl;
       }
       return null;
    }


    public Node mergeTwoLists(Node headA,Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(77);
        myLinkedList.addFirst(77);
        myLinkedList.addFirst(79);
        myLinkedList.addFirst(80);
        myLinkedList.addFirst(77);
        myLinkedList.display();
        MyLinkedList myLinkedList2 = new MyLinkedList();
        //Node ret = getIntersectionNode(myLinkedList.head,myLinkedList2.head) ;
        System.out.println(myLinkedList.FindKthToTail(3).data);
    }
}
