package db;

import models.Book;
import models.Borrower;
import models.Library;

public class DBLibrary {

    public static void addBookToLibrary(Book book, Library library){
        library.addBookToLibrary(book);
        DBHelper.save(library);
        DBHelper.save(book);
    }

    public static void loanBook(Library library, Borrower borrower, Book book){
        library.loanBook(borrower, book);
        DBHelper.save(library);
        DBHelper.save(borrower);
        DBHelper.save(book);

    }

}
