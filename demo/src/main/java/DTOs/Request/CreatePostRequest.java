package DTOs.Request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class CreatePostRequest {

    private String title;
    private String body;

}
