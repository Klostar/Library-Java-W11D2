import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;


    @Before
    public void before(){
        library = new Library(4);

    }
    @Test
    public void hasCapacity(){
    assertEquals(4, library.hasCapacity());
    }

    @Test
    public void bookCount(){
        assertEquals(0, library.bookCount());
    }


}
