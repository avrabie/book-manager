package ro.carti.orfane.bookmanager.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
public class Book {

    @Id
    private String id;
    private String author;
    private String title;

}
