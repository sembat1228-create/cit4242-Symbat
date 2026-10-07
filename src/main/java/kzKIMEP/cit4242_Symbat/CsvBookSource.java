package kzKIMEP.cit4242_Symbat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class CsvBookSource implements BookSource {

    private final String resource;

    public CsvBookSource(String resource) {
        this.resource = resource;
    }

    @Override
    public List<Book> load() {
        InputStream input = getClass().getResourceAsStream(resource);

        if (input == null) {
            throw new IllegalArgumentException("Resource not found: " + resource);
        }

        return new BufferedReader(new InputStreamReader(input))
                .lines()
                .filter(line -> !line.isBlank())
                .map(line -> {
                    String[] parts = line.split(";");
                    return new Book(parts[0], parts[1], Integer.parseInt(parts[2]));
                })
                .toList();
    }
}