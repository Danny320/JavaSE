import java.util.Stack;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200514
 * @Description:
 * @USer:LD
 * @Date: 2020-05-14 19:56
 * @time: 19:56
 **/
public class MyQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        this.stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()) {
            return -1;
        }
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
            return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.isEmpty()&&stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}
