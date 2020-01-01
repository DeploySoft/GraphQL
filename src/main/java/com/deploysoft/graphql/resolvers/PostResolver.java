package com.deploysoft.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.deploysoft.graphql.dto.AuthorDTO;
import com.deploysoft.graphql.dto.PostDTO;

public class PostResolver implements GraphQLResolver<PostDTO> {

    public AuthorDTO getAuthor(PostDTO postDTO) {
        //TODO Here I should add a service, repository or anything else that allows me search the Author
        return new AuthorDTO();
    }
}
