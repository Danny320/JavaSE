package user;

/**
 * Created with Intellij IDEA
 *
 * @program: TestBook
 * @Description:
 * @USer:LD
 * @Date: 2020-05-05 23:13
 * @time: 23:13
 **/
public abstract class User {
    public String name;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
}
