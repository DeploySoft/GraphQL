package com.deploysoft.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.deploysoft.graphql.infrasctructure.repository.entity.Post;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PostQuery implements GraphQLQueryResolver {

    public List<Post> getPost(int count, int offset) {
        return Collections.emptyList();
    }
}
