import db.DBHelper;
import db.DBLibrary;
import models.Book;
import models.Borrower;
import models.Library;

public class Runner {

    public static void main(String[] args) {

        Library library = new Library("Glasgow Library");
        DBHelper.save(library);

        Book book1 = new Book("Trouble in Paradise", "Derek Leach", "Romantic tragedy", library);
        DBHelper.save(book1);
        Book book2 = new Book("All Loved Up", "Redek Cheal", "Romance", library);
        DBHelper.save(book2);

        DBLibrary.addBookToLibrary(book1, library);
        DBLibrary.addBookToLibrary(book2, library);

        Borrower borrower1 = new Borrower("Richard", library);
        DBHelper.save(borrower1);
        Borrower borrower2 = new Borrower("Derek", library);
        DBHelper.save(borrower2);

        DBLibrary.loanBook(library, borrower1, book1);

    }
}
