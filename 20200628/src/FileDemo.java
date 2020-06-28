import java.io.File;
import java.io.IOException;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200628
 * @Description:
 * @USer:LD
 * @Date: 2020-06-28 17:52
 * @time: 17:52
 **/
public class FileDemo {
    public static void main(String[] args) {
//        String path = "随便删\\hello.txt";
//        //构建文件对象
//        File file = new File(path);
//        File dest = new File("随便删\\jjj.txt");
//        boolean aa = file.renameTo(dest);
//        System.out.print(aa);
        //常见属性
        //文件存在&&是普通文件
//        System.out.println(file.isFile());
//        //文件存在&&是文件夹
//        System.out.println(file.isDirectory());
//        System.out.println(file.isAbsolute());//是否为绝对路径表示
//        System.out.println(file.isHidden());//是否为隐藏文件
//        System.out.println(file.exists());//文件是否存在
//        System.out.println(file.getAbsolutePath());//获取绝对路径
//        System.out.println(file.getPath());//获取当前路径
//        System.out.println(file.getName());//文件名
//        System.out.println(file.getParent());//父节点为
//        System.out.println(file.canRead());//是否可读
//        System.out.println(file.canWrite());//是否可写
//        System.out.println(file.canExecute());//是否可执行

//        try {
//            boolean newFile = file.createNewFile();//创建普通文件
//            System.out.print(newFile);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//        boolean mkdir = file.mkdir();//创建文件夹
//        System.out.print(mkdir);

        File file = new File("E:\\学习\\本地仓库\\JavaSE\\随便删");
        File[] files = file.listFiles();
        for (File f: files) {
            System.out.println(f.getAbsoluteFile());
        }
    }
}
