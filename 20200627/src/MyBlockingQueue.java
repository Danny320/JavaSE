/**
 * Created with Intellij IDEA
 *
 * @program: 20200627
 * @Description:循环队列
 * @USer:LD
 * @Date: 2020-06-27 16:29
 * @time: 16:29
 **/
public class MyBlockingQueue {
    private int[] array = new int[16];//存放数据的数组
    private volatile int size;//当前已有元素个数
    private int frontIndex = 0;//指向队首元素的下标
    private int rearIndex = 0;//指向下一个可用位置的下标

    public synchronized void push (int element) throws InterruptedException {
        while (size >= array.length) {
            throw new RuntimeException("队列已满");
            //wait();
        }
        array[rearIndex] = element;
        rearIndex = rearIndex+1;
        if(rearIndex >array.length) {
            rearIndex -= array.length;
        }
        size++;
        notifyAll();
    }
    public synchronized int pop () throws InterruptedException {
        while (size == 0) {
            throw new RuntimeException("队列为空");
            //wait();
        }
        int element = array[frontIndex];
        frontIndex = (frontIndex+1) &array.length;
        size--;
        notifyAll();
        return element;
    }
    public int size() {return size;}
}
