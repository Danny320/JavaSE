import java.util.Stack;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200514
 * @Description:
 * 最小栈
 * @USer:LD
 * @Date: 2020-05-14 20:19
 * @time: 20:19
 **/
public class MinStack {
    public Stack<Integer> stack1;
    public Stack<Integer> minstack;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack1 = new Stack<>();
        this.minstack = new Stack<>();
    }

    public void push(int x) {
        this.stack1.push(x);
        if(this.minstack.empty()) {
            minstack.push(x);
        }else {
            int tmp = minstack.peek();
            if(x <= tmp) {
                minstack.push(x);
            }
        }
    }

    public void pop() {
       if(!stack1.empty()) {
           int tmp = stack1.pop();
           if(tmp == minstack.peek()) {
               minstack.pop();
           }
       }
    }

    public int top() {
        if(this.stack1.empty()) {
            return -1;
        }
        return this.stack1.peek();
    }

    public int getMin() {
        if(this.minstack.empty()) {
            return -1;
        }
        return this.minstack.peek();
    }
}
