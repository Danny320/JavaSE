package operation;

import book.Book;
import book.BookList;

/**
 * Created with Intellij IDEA
 *
 * @program: TestBook
 * @Description:
 * @USer:LD
 * @Date: 2020-05-05 22:56
 * @time: 22:56
 **/
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0;i < bookList.getUsedSize();i++){
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
