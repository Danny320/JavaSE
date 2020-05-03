package book;

/**
 * Created with Intellij IDEA
 *
 * @program: TestBook
 * @Description:
 * @USer:LD
 * @Date: 2020-05-03 16:46
 * @time: 16:46
 **/
public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public void setName(String name) { this.name = name; }

    public void setAuthor(String author) { this.author = author; }

    public void setPrice(int price) { this.price = price; }

    public void setType(String type) { this.type = type; }

    public String getName() { return name; }

    public String getAuthor() { return author; }

    public int getPrice() { return price; }

    public String getType() { return type; }

    public boolean isBorrowed() { return isBorrowed; }

    public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }

    @Override
    public String toString() {
        return "BookList{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
