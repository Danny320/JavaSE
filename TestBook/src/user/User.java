package user;

import book.BookList;
import operation.IOperation;

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
    protected IOperation[] operations;
    public User(String name) { this.name = name; }
    public abstract int  menu();
    public void doOperation(BookList bookList,int choice) {
        this.operations[choice].work(bookList);
    }
}
