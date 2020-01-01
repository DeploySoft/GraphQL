package com.deploysoft.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.deploysoft.graphql.infrasctructure.repository.entity.Post;
import com.deploysoft.graphql.infrasctructure.services.IPostService;
import org.springframework.stereotype.Component;

@Component
public class PostMutation implements GraphQLMutationResolver {


    private final IPostService iPostService;

    public PostMutation(IPostService iPostService) {
        this.iPostService = iPostService;
    }


    public Post createPost(String title, String category) {
        Post post = new Post();
        post.setTittle(title);
        post.setCategory(category);
        return this.iPostService.createPost(post);
    }

}
