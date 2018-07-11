import models.Book;
import models.Borrower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBook {


    Book book1;
    Book book2;
    Borrower borrower;

    @Before
    public void setUp() {
        book1 = new Book("Treasure Island", "Richard PK", "Action");
        book2 = new Book("Lost", "Derek Leach", "Biography");
        borrower = new Borrower("Peter Pan");
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

