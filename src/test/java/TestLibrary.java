import models.Book;
import models.Borrower;
import models.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestLibrary {

    Library library;
    Book book1;
    Book book2;
    Borrower borrower;

    @Before
    public void setUp() throws Exception {

        library = new Library("The Derek Leach Library for Contemporary Romance");
        book1 = new Book("Trouble in Paradise", "Derek Leach", "Romantic tragedy");
        book2 = new Book("All Loved Up", "Redek Cheal", "Romance");
        borrower = new Borrower("Richard");

    }

    @Test
    public void libraryCanAddBooks() {
        library.addBookToLibrary(book1);
        assertEquals(1, library.getBookCollection().size());
    }

    @Test
    public void borrowerCanAddBookToBorrower() {
        library.addBookToBorrower(borrower, book1);
        assertEquals(1, borrower.getBorrowedBooks().size());
    }

    @Test
    public void bookCanHaveBorrower() {
        library.addBookToBorrower(borrower, book1);
        assertNotNull(book1.getBorrower());
    }

    @Test
    public void libraryCantLoanBookNotInCollection() {
        library.loanBook(borrower, book1);
        assertEquals(0, borrower.getBorrowedBooks().size());
    }

    @Test
    public void canLoanBookInCollection() {
        library.addBookToLibrary(book1);
        library.loanBook(borrower, book1);
        assertEquals(1, borrower.getBorrowedBooks().size());
        assertEquals(0, library.getBookCollection().size());
        assertEquals(true, book1.getOnLoan());
    }
}

