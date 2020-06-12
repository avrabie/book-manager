package ro.carti.orfane.bookmanager.seeder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;
import ro.carti.orfane.bookmanager.models.Book;
import ro.carti.orfane.bookmanager.repos.BookRepo;

@Configuration
public class BooksSeeder {

    @Bean
    CommandLineRunner commandLineRunner(BookRepo bookRepo) {
        return strings -> {
            Book book1 = new Book();
            book1.setAuthor("Inna");
            book1.setTitle("Inna's first Book");
            Mono<Book> save = bookRepo.save(book1);
            save.subscribe();
        };
    }
}
