import java.io.*;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200629
 * @Description:
 * @USer:LD
 * @Date: 2020-06-29 09:51
 * @time: 09:51
 **/
public class FileStreamDemo {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("测试目录\\hello.txt")){
            byte[] buf = new byte[1024];
            while (true) {
                int n = is.read(buf);
                if(n == -1) {
                    break;
                }
                for (int i = 0; i < n; i++) {
                    byte b = buf[i];
                    System.out.printf("%c%n", b);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }


        try(OutputStream os = new FileOutputStream("测试目录\\world.txt")) {
            os.write('H');
            os.write('\r');
            os.write('\n');
            os.write('W');
            os.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
