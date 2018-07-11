import models.Book;
import models.Borrower;
import models.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBook {


    Book book1;
    Book book2;
    Borrower borrower;
    Library library;

    @Before
    public void setUp() {
        library = new Library("Great library");
        book1 = new Book("Treasure Island", "Richard PK", "Action", library);
        book2 = new Book("Lost", "Derek Leach", "Biography", library);
        borrower = new Borrower("Peter Pan", library);
        }

    @Test
    public void isOnLoan() {
        book1.setOnLoan(true);
        assertEquals(true, book1.getOnLoan());
        }

    @Test
    public void hasBorrower() {
        book1.setBorrower(borrower);
        assertEquals("Peter Pan", book1.getBorrower().getName());
    }



    }

