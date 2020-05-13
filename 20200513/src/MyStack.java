import org.omg.CORBA.Object;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200513
 * @Description:
 * @USer:LD
 * @Date: 2020-05-13 22:13
 * @time: 22:13
 **/
public class MyStack<T>{
    public T[] elem;//数组
    public int top;//表示当前可以存放数据元素的下标

    public MyStack() {
        this.elem = (T[])new Object[10];
    }

    public void push(T val){
        if(Full()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.top] = val;
        top++;
    }

    public boolean Full() {
        return this.elem.length == top;
    }

    public boolean empty() {
        return top == 0;
    }

    public T pop() {
        if(empty()) {
            throw new RuntimeException("栈空");
        }
        T data = this.elem[this.top-1];
        this.top--;
        return data;
    }

    public T peek() {
        if(empty()) {
            throw new RuntimeException("栈空");
        }
        T data = this.elem[this.top-1];
        return data;
    }

    public int size() {
        return this.top;
    }
}
