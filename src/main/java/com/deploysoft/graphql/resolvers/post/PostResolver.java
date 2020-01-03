package com.deploysoft.graphql.resolvers.post;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.deploysoft.graphql.dto.AuthorDTO;
import com.deploysoft.graphql.dto.PostDTO;
import com.deploysoft.graphql.infrasctructure.repository.entity.Author;
import com.deploysoft.graphql.infrasctructure.repository.entity.Post;

public class PostResolver implements GraphQLResolver<Post> {

    public Author getAuthor(Post post) {
        //TODO Here I should add a service, repository or anything else that allows me search the Author
        return new Author((long) 1, "HERE", null);
    }
}
