package pl.coderslab.beans;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();

    Optional<Book> get(long id);

    void add(Book book);

    void delete(long id);

    void update(Book book);
}
