import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public static void main(String[] args) {
        HashMap<String,String> books= new HashMap<>();
        books.put("The Wide Window ", "Mystery");
        books.put("The Vile Village", "Mystery");
        books.put("The Hostile Hospital","Mystery");
        books.put("The Story of Tracy Beaker", "Childrens Fiction");

        System.out.println(books.size());
        System.out.println(books.values());

        System.out.println(books.entrySet());
        int counter =0;
        String countingFor = "Mystery";
        for(String value : books.keySet()){
            if(books.get(value).equals(countingFor)){
                counter++;
            }
        }
        System.out.println(countingFor + ":" + counter);
    }

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int hasCapacity() {
        return capacity;
    }

    public int bookCount(){
        return books.size();
    }

    public void addBook(Book book) {
        if(bookCount() < capacity){
            books.add(book);
        }
    }


}
