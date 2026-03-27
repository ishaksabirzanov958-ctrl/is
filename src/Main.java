import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library l = new Library("Сынган кыллыч");
        Library l2 = new Library("Ак кеме");
        System.out.println(l + " " + l2);




    }
}
class Library {
    String name;
    List<Book> books;
    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }
}
interface Readble{
    void read();
}