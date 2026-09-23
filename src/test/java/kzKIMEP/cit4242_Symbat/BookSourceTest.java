package kzKIMEP.cit4242_Symbat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookSourceTest {

    @Test
    void catalogueCanUseInMemorySourceWithoutFile() {
        BookSource source = new InMemoryBookSource();

        Catalogue catalogue = Catalogue.from(source);

        assertEquals(3, catalogue.books().size());
        assertEquals("Clean Code", catalogue.books().get(0).title());
    }
}