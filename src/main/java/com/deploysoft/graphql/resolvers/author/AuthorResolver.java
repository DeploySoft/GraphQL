package com.deploysoft.graphql.resolvers.author;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.deploysoft.graphql.dto.PostDTO;
import com.deploysoft.graphql.infrasctructure.repository.entity.Author;
import com.deploysoft.graphql.infrasctructure.services.IAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class AuthorResolver implements GraphQLResolver<Author> {

    private final IAuthorService iAuthorService;

    public Optional<Author> getAuthor(PostDTO postDTO) {
        return iAuthorService.getAuthor(postDTO.getAuthorId());
    }

}
