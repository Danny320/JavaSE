import com.sun.org.apache.xerces.internal.impl.dv.XSSimpleType;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200627
 * @Description:
 * @USer:LD
 * @Date: 2020-06-27 09:21
 * @time: 09:21
 **/
public class SingletonStarve {
    //1.我需要保存我仅有的一个对象
    private static final SingletonStarve instance;
    //2.饿汉模式，也就是一开始就初始化
    //静态代码块or直接初始化都可以
    static {
        instance = new SingletonStarve();
    }
    //3.如果需要该类的对象，只能使用这个instance指向的对象
    // 所以，需要提供方法，把对象返回
    public static SingletonStarve getInstance() {
        return instance;
    }
    private SingletonStarve() {
    }
}
