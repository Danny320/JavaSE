import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200512
 * @Description:
 * @USer:LD
 * @Date: 2020-05-12 15:17
 * @time: 15:17
 **/
public class TestDemo<T> {
    T value;

    public TestDemo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        TestDemo<Integer> a = new TestDemo<>(2);
        System.out.println(a.getValue());
        TestDemo<Character> ch = new TestDemo<>('h');
        System.out.println(ch.getValue());
    }
}
