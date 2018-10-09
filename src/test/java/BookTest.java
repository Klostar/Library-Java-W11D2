import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;
    Book book2;

    @Before
    public void before(){
        book = new Book("The Bad Beginning", "Lemony Snicket","Mystery");
        book2 = new Book("The Reptile Room", "Lemony Snicket", "Mystery");

    }

    @Test
    public void hasTitle(){
        assertEquals("The Bad Beginning", book.hasTitle());
    }

    @Test
    public void has

}
