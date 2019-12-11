package PrviZadatak;

import PrviZadatak.Author;
import PrviZadatak.Book;

public class TestClass {

    public static void main(String[] args) {

    Author author = new Author("bojan", "hotmail.com", 'M');
    Book book = new Book("bojan", "bojan", 22.30,200);

    book.toString();
    }
}
