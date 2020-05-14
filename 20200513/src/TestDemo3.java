import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200513
 * @Description:
 * 用队列实现栈
 * @USer:LD
 * @Date: 2020-05-14 13:37
 * @time: 13:37
 **/
public class TestDemo3 {
    public Queue<Integer> queue1 = new LinkedList<>();
    public Queue<Integer> queue2 = new LinkedList<>();
    /** Initialize your data structure here. */
    public TestDemo3() {
         this.queue1 = new LinkedList<>();
         this.queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(empty() || !queue1.isEmpty()) {
            queue1.add(x);
        }else {
            queue2.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()) {
            return -1;
        }
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();
        if(!queue1.isEmpty()) {
            for(int i = 0; i < qSize1-1; i++) {
                int tmp = queue1.poll();
                queue2.offer(tmp);
            }
            return queue1.poll();
        }else {
            for(int i = 0; i < qSize2-1; i++) {
                int tmp = queue2.poll();
                queue1.offer(tmp);
            }
            return queue2.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        if(empty()) {
            return -1;
        }
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();

        if(!queue1.isEmpty()) {
            for(int i = 0; i < qSize1-1; i++) {
                int tmp = queue1.poll();
                queue2.offer(tmp);
            }
            queue2.add(queue1.peek());
            return queue1.poll();
        }else {
            for(int i = 0; i < qSize2-1; i++) {
                int tmp = queue2.poll();
                queue1.offer(tmp);
            }
            queue1.add(queue2.peek());
            return queue2.poll();
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(this.queue1.isEmpty()&&this.queue2.isEmpty()) {
            return true;
        }
        return false;
    }
}
