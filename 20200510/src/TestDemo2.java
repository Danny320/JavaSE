import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200510
 * @Description:
 * @USer:LD
 * @Date: 2020-05-10 10:12
 * @time: 10:12
 **/
public class TestDemo2 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.put("国家主席","习近平");
        map.put("语文老师","张三");
        map.put("数学老师","李四");
        System.out.println(map.getOrDefault("英语老师","王五"));
    }

    public static void main1(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add("hahaha");
        collection1.add("hehehe");
        collection1.add(1234);
        System.out.println(collection1);
        collection1.remove(1234);
        System.out.println(collection1);
        System.out.println(collection1.size());
        collection1.toArray();
        System.out.println(Arrays.toString(collection1.toArray()));
        collection1.clear();
        System.out.println(collection1);
        System.out.println(collection1.isEmpty());
    }
}
