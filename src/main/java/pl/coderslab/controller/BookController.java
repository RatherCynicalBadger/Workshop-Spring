package pl.coderslab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.coderslab.beans.Book;
import pl.coderslab.beans.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService service) {
        this.bookService = service;
    }

    @GetMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable long id) {
        return bookService.get(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No book with given id exist."));
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        System.out.println("Adding book with title: " + book.getTitle());
        bookService.add(book);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book) {
        System.out.println("Updating book:" + book.toString());
        bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id) {
        System.out.println("Deleting book with id:" + id);
        bookService.delete(id);
    }
}
