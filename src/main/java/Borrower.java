import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<>();

    }


    public int collectonCount() {
     return books.size();
    }


    public void addBook(Book book) {
        books.add(book);
    }
}
