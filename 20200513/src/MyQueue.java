/**
 * Created with Intellij IDEA
 *
 * @program: 20200513
 * @Description:
 * @USer:LD
 * @Date: 2020-05-14 10:08
 * @time: 10:08
 **/
class Node<T> {
    public T data;
    public  Node next;

    public Node(T data) {
        this.data = data;
    }
}
public class MyQueue<T> {
    public Node front;//头
    public Node rear;//尾巴
    public int useSize;

    //添加
    public boolean offer(int val) {
        Node node = new Node(val);
        if(this.front.next == null) {
            this.front = node;
            this.rear = node;

        }else {
            this.rear.next = node;
            this.rear = rear.next;
        }
        useSize++;
        return true;
    }


    //出队且删除队头元素
    public T poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        T data = (T)this.front.data;
        this.front = this.front.next;
        return data;
    }


    //
    public T peek() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        T data = (T)this.front.data;
        return data;
    }

    public int size() {
        return this.useSize;
    }

    public boolean isEmpty() {
        return this.useSize == 0;
    }
}
