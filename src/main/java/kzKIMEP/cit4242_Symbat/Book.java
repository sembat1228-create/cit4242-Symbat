package kzKIMEP.cit4242_Symbat;

public record Book(String title, String author, int pages) {

    public boolean isLong() {
        return pages > 300;
    }
}