import java.util.Stack;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200513
 * @Description:
 * @USer:LD
 * @Date: 2020-05-13 22:09
 * @time: 22:09
 **/
public class TestDemo {

    public static void main2(String[] args) {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.push(1);//入栈
//        stack.push(2);//入栈
//        stack.push(3);//入栈
        //stack.pop();//出栈
        stack.peek();//取出栈顶元素
       System.out.println( stack.empty());
       System.out.println(stack.search(1));
    }
}
