package com.deploysoft.graphql.resolvers.post;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.deploysoft.graphql.infrasctructure.repository.entity.Post;
import com.deploysoft.graphql.infrasctructure.services.IPostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PostQuery implements GraphQLQueryResolver {

    private final IPostService iPostService;

    public List<Post> getPost(int count, int offset) {
        return iPostService.getPosts();
    }
}
