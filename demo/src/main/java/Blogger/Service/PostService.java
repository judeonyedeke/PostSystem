package Blogger.Service;

import Blogger.Data.Model.Post;
import DTOs.Request.CreatePostRequest;

import java.util.List;

public interface PostService {

    void createPost(CreatePostRequest createPostRequest);
    Post viewPost(String id);

    List<Post> viewAllPost();

}
