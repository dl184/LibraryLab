import models.Book;
import models.Borrower;
import org.junit.Before;
import org.junit.Test;

public class TestLibrary {

    Book book;
    Borrower borrower;

    @Before
    public void setUp() throws Exception {

        Book book = new Book("Trouble in Paradise", "Derek Leach", "Romantic tragedy");
        Borrower borrower = new Borrower("Richard");
    }






}

