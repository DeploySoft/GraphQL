package com.deploysoft.graphql.resolvers.post;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.deploysoft.graphql.infrasctructure.repository.entity.Author;
import com.deploysoft.graphql.infrasctructure.repository.entity.Post;
import com.deploysoft.graphql.infrasctructure.services.IPostService;
import org.springframework.stereotype.Component;

@Component
public class PostMutation implements GraphQLMutationResolver {


    private final IPostService iPostService;

    public PostMutation(IPostService iPostService) {
        this.iPostService = iPostService;
    }

    //TODO here I should receipt a DTO to parse entity and don't expose the real domain
    public Post createPost(String title, String category, int author) {
        Post post = new Post();
        post.setTittle(title);
        post.setCategory(category);
        post.setAuthor(new Author((long) author, null, null));
        return this.iPostService.createPost(post);
    }

}
