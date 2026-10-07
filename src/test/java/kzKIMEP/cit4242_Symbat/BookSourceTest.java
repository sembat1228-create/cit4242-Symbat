package kzKIMEP.cit4242_Symbat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookSourceTest {

    @Test
    void catalogueCanUseInMemorySourceWithoutFile() {
        BookSource source = new InMemoryBookSource();

        Catalogue catalogue = Catalogue.from(source);

        assertEquals(3, catalogue.books().size());
        assertEquals("Clean Code", catalogue.books().get(0).title());
        assertEquals("Robert C. Martin", catalogue.books().get(0).author());
    }

    @Test
    void unknownAuthorReturnsEmptyList() {
        Catalogue catalogue = Catalogue.from(new InMemoryBookSource());

        assertTrue(catalogue.titlesBy("Unknown Author").isEmpty());
    }
}