package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: TestBook
 * @Description:
 * @USer:LD
 * @Date: 2020-05-05 22:56
 * @time: 22:56
 **/
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        for (int i = 0;i< bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                //可以借阅
                book.setBorrowed(true);
                System.out.println("查找成功！");
                return;
            }
        }
        System.out.println("没有你要查找的那本书！");
    }
}
