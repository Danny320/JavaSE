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
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(77);
        myLinkedList.addFirst(78);
        myLinkedList.addFirst(79);
        myLinkedList.addFirst(80);
        myLinkedList.addFirst(81);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(80));
        System.out.println(myLinkedList.size());
    }
}
