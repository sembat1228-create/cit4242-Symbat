package kzKIMEP.cit4242_Symbat;

public record Book(String title, int pages) {

    public boolean isLong() {
        return pages > 300;
    }
}