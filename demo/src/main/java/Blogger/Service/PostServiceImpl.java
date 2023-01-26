package Blogger.Service;

import Blogger.Data.Model.Post;
import Blogger.Data.Repositories.PostRepository;
import DTOs.Request.CreatePostRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService{

    private PostRepository postRepository;

    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setTitle(createPostRequest.getTitle());
        post.setBody(createPostRequest.getBody());
        postRepository.save(post);
    }

    @Override
    public Post viewPost(String id) {
        return null;
    }

    @Override
    public List<Post> viewAllPost() {
        return null;
    }
}
