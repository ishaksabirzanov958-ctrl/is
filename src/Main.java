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



class Book{
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public String getinfo(){
        return title + " " + author + " " + isbn;

    }

}

class EBook extends Book{
    String title;
    String author;
    String isbn;

    public EBook(String title, String author, String isbn){
        super(title, author, isbn);

    }

    public String getinfo(){
        return title + " " + author + " " + isbn;
    }

}