package pl.coderslab.beans;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MockBookService implements BookService {

    private static Long nextId = 8L;
    private final List<Book> list;

    public MockBookService() {
        this.list = List.of(
                new Book(1L, "9788324631766", "Thinking in Java", "Bruce	Eckel", "Helion", "programming"),
                new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion", "programming"),
                new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion", "programming"),
                new Book(4L, "9780130800000", "Necronomicon", "Old Gods", "Cult of Cthulhu", "occult"),
                new Book(5L, "1234567891011", "How to enforce regular learning", "Duolingo Owl", "Duolingo", "military"),
                new Book(6L, "0000000000004", "Art of War", "Sun-Tzu", "Chinesee Emperor, IDK?", "military"),
                new Book(7L, "9999999977777", "Potatoes", "Samwise Gamgee", "Minas-Tirith Publishing", "culinary")
        );
    }

    @Override
    public List<Book> getBooks() {
        return this.list;
    }

    @Override
    public Optional<Book> get(long id) {
        return Optional.empty();
    }

    @Override
    public void add(Book book) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(Book book) {

    }
}
