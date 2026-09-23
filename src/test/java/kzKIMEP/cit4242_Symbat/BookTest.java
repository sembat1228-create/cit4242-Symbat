package kzKIMEP.cit4242_Symbat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void recordsWithSameValuesAreEqual() {
        Book x = new Book("Clean Code", 464);
        Book y = new Book("Clean Code", 464);

        assertEquals(x, y);
        assertEquals(x.hashCode(), y.hashCode());
    }

    @Test
    void keepsBehaviouralMethod() {
        Book longBook = new Book("Clean Code", 464);
        Book shortBook = new Book("Short Book", 100);

        assertTrue(longBook.isLong());
        assertFalse(shortBook.isLong());
    }
}