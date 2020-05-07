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
 * @Date: 2020-05-05 22:55
 * @time: 22:55
 **/
public class DelOpreation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name = scanner.nextLine();
        int i = 0;
        for (i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(true);
                break;
            }
        }
        if (i == bookList.getUsedSize()) {
            System.out.println("没有那本书！");
            return;
        }
        for (int pos = i;pos < bookList.getUsedSize()-1;i++) {
            Book book = bookList.getBook(pos+1);
            bookList.setBooks(pos,book);
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除成功！");
    }
}
