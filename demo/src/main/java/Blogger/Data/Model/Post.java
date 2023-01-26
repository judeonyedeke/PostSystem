package Blogger.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Post {
    @Id
    private String id;
    private String title;
    private String body;
    private final LocalDateTime createdAt = LocalDateTime.now();
}
