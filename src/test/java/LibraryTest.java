import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Harry Potter", "J K Rowling", "fantasy");
        book2 = new Book("The war on Art", "Steven Pressfield", "non-fiction");
        book3 = new Book("The Wizard of Oz", "L Frank Baum", "fantasy");
    }

    @Test
    public void checkStock(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void checkCanAddBook(){
        library.addBook(this.book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void checkBookByGenre(){
        library.addBook(this.book1);
        library.addBook(this.book2);
        library.addBook(this.book3);
        HashMap booksGenres = library.countGenres();
        assertEquals(2, library.getCount("fantasy"));
    }
}