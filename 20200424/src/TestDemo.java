/**
 * Created with Intellij IDEA
 *
 * @program: 20200424
 * @Description:
 * @USer:LD
 * @Date: 2020-04-24 19:52
 * @time: 19:52
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        //MyArrayList myArrayList2 = new MyArrayList();
        myArrayList1.add(0,1);
        myArrayList1.add(1,2);
        myArrayList1.add(2,3);
        myArrayList1.add(3,4);
        myArrayList1.display();
        boolean ret = myArrayList1.contains(1);
        System.out.println( ret);
        System.out.println(myArrayList1.search(3));
        System.out.println(myArrayList1.getPos(3));
        myArrayList1.remove(3);
        myArrayList1.display();
    }

}
