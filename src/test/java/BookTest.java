import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Bad Beginning", "Lemony Snicket","Mystery");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Bad Beginning", book.hasTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Lemony Snicket", book.hasAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Mystery", book.hasGenre());
    }
}
