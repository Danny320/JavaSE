/**
 * Created with Intellij IDEA
 *
 * @program: 20200526
 * @Description:
 * @USer:LD
 * @Date: 2020-05-26 21:57
 * @time: 21:57
 **/

import org.omg.CORBA.Object;

/**
 * 1、<T>：T占位符表示 当前类是 泛型类
 * 2、放数据的时候，可以自动进行类型检查
 * 3、取数据的时候，可以自动进行类型转换
 * 4、泛型到底是怎么编译的？
 *    泛型是在编译时期的一种机制-》擦除机制。  编译的时候，按照Object编译的。
 *    不是替换成Object。
 * 5、泛型是有边界的。
 *
 * 坑：
 * 1、不能new 泛型类型的数组
 * 2、简单类型不能作为泛型类型的参数。
 *      MyStack<int> myStack3 = new MyStack<>();
 * 3、泛型类型的参数，不参与类型的组成
 */
class MyStack<T> {
    public T[] elem;
    public int top;

    public MyStack() {
        this.elem = (T[]) new Object[10];
    }

    public void push(T val) {
        this.elem[this.top] = val;
        this.top++;
    }

    public T peek() {
        return this.elem[this.top-1];
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(20);

        int ret = myStack.peek();
        System.out.println(ret);

        MyStack<String> myStack2 = new MyStack<>();
        myStack2.push("abcd");
        myStack2.push("efgh");

    }
}
