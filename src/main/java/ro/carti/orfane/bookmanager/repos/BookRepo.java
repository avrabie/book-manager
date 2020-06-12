package ro.carti.orfane.bookmanager.repos;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import ro.carti.orfane.bookmanager.models.Book;

@Repository
public interface BookRepo extends ReactiveMongoRepository<Book, String> {

}
