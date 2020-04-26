/**
 * Created with Intellij IDEA
 *
 * @program: 20200426
 * @Description:
 * @USer:LD
 * @Date: 2020-04-26 18:32
 * @time: 18:32
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.display();
        myLinkedList.remove(2);
        myLinkedList.display();

    }

}
