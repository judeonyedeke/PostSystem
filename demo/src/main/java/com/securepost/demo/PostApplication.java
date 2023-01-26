package com.securepost.demo;

import Blogger.Data.Model.Post;
import Blogger.Data.Repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);
	}

	CommandLineRunner runner(PostRepository repository){
		return args -> {
			Post post = new Post();
			post.setTitle("The Rise of Ababaku");
			post.setBody("The man named Ababaku hails from the old city of Owu. He was greatly feared as who who possessed mystical powers.");
			repository.insert(post);
		};
	}
}
