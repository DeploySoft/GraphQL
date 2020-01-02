package com.deploysoft.graphql.infrasctructure.services;

import com.deploysoft.graphql.infrasctructure.repository.entity.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {

    Author createAuthor(final Author post);

    Optional<Author> getAuthor(final int id);

    List<Author> getAuthors();
}
