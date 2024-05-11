package pl.coderslab.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pl.coderslab.beans.Book;
import pl.coderslab.beans.BookService;

@RestController
@RequestMapping("/books")
@JsonView(MappingJackson2JsonView.class)
public class BookController {

    private final BookService bookService;

    public BookController(BookService service) {
        this.bookService = service;
    }

    @GetMapping("/helloBook")
    public String helloBook() {
        return (new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming")).toString();
    }
}
