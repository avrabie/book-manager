package ro.carti.orfane.bookmanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ro.carti.orfane.bookmanager.models.Book;
import ro.carti.orfane.bookmanager.repos.BookRepo;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping
    public Mono<String> sayHello() {
        return Mono.just("Hello from carti orfane 2");
    }


    @GetMapping("/all")
    public Flux<Book> getAll() {
        return bookRepo.findAll();
    }

    @PostMapping()
    public Mono<Book> addBoot(@RequestBody Book book) {
        return bookRepo.save(book);
    }

}
