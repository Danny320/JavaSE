import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200510
 * @Description:
 * @USer:LD
 * @Date: 2020-05-12 16:43
 * @time: 16:43
 **/
class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}

public class MyException {
    private static String username = "admin";
    private static String password = "123456";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名和密码：");
        String username1 = scanner.nextLine();
        String password1 = scanner.nextLine();
        try {
            login(username1,password1);
        }catch (UserError userError) {
            userError.fillInStackTrace();
        }catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }

    }
    public static void login(String username,String password) throws UserError,PasswordError{
        if(!MyException.username.equals(username)) {
            throw new UserError("用户名错误");
        }
        if(!MyException.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登录成功！");
    }

}
