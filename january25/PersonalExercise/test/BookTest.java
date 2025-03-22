import main.java.com.semicolon.africa.model.Books;
import main.java.com.semicolon.africa.model.LibraryManagement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void test_that_add_book(){
        Books books = new Books("ComeHome","Kimberly",2001);
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.addBook(books);
        assertEquals(1,libraryManagement.viewBooks().size());
    }
    @Test
    public void test_that_add_books(){
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.addBook(new Books("BigSis","Ayomide",2005));
        libraryManagement.addBook(new Books("Come","Onyii",2000));
        assertEquals(2,libraryManagement.viewBooks().size());
    }
    @Test
    public void test_that_remove_book() {
        LibraryManagement libraryManagement = new LibraryManagement();
        Books books = new Books("BigSis","Ayomide",2005);
        Books books1 = new Books("Come","Onyii",2000);
        libraryManagement.addBook(books);
        libraryManagement.addBook(books1);
        libraryManagement.removeBooks(books1);
        assertEquals(1,libraryManagement.viewBooks().size());
    }
    @Test
    public void test_that_search_books_by_name(){
        LibraryManagement libraryManagement = new LibraryManagement();
        Books books = new Books("BigSis","Ayomide",2005);
        Books books1 = new Books("Come","Onyii",2000);
        libraryManagement.addBook(books);
        libraryManagement.addBook(books1);
        assertEquals(books,libraryManagement.searchBooks("BigSis"));
    }

}
