package kzKIMEP.cit4242_Symbat;

import java.util.List;

public class InMemoryBookSource implements BookSource {

    @Override
    public List<Book> load() {
        return List.of(
                new Book("Clean Code", "Robert C. Martin", 464),
                new Book("Effective Java", "Joshua Bloch", 416),
                new Book("Java: The Complete Reference", "Herbert Schildt", 1248)
        );
    }
}