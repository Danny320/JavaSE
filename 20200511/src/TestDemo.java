import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200511
 * @Description:
 * @USer:LD
 * @Date: 2020-05-11 18:31
 * @time: 18:31
 **/
public class TestDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");//添加
        list.add("bit");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        list1.add("haha");
        list1.add("tttt");

        list.addAll(list1);
        System.out.println(list);

        String ret = list.remove(1);
        System.out.println(ret);

        list.remove("bit");
        System.out.println(list);

        System.out.println("======get======");
        ret = list.get(0);
        System.out.println(ret);

        System.out.println("=====set=======");
        ret = list.set(0,"set");
        System.out.println(ret);

        System.out.println(list.contains("set"));

        System.out.println(list.indexOf("haha"));


        List<String> ret1 = list.subList(0,2);
        System.out.println(ret1);

    }
}
