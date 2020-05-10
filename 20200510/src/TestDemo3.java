import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200510
 * @Description:
 * @USer:LD
 * @Date: 2020-05-10 16:49
 * @time: 16:49
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String tmp = sb.toString();
                if (!tmp.contains(ch + "")) {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }
}
