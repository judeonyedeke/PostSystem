package Blogger.Controller;

import Blogger.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/Post")
public class PostController {
    @Autowired
    private PostService postService;


}
