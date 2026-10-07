package kzKIMEP.cit4242_Symbat;

import java.util.List;

public class Catalogue {

    private final List<Book> books;

    public Catalogue(List<Book> books) {
        this.books = books;
    }

    public static Catalogue from(BookSource source) {
        return new Catalogue(source.load());
    }

    public List<Book> books() {
        return books;
    }

    public List<String> titlesBy(String author) {
        return books.stream()
                .filter(book -> book.author().equals(author))
                .map(Book::title)
                .sorted()
                .toList();
    }
}