package com.deploysoft.graphql.infrasctructure.services.impl;

import com.deploysoft.graphql.infrasctructure.repository.IAuthorRepository;
import com.deploysoft.graphql.infrasctructure.repository.entity.Author;
import com.deploysoft.graphql.infrasctructure.services.IAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements IAuthorService {

    private final IAuthorRepository iAuthorRepository;

    @Override
    public Author createAuthor(Author author) {
        return iAuthorRepository.save(author);
    }

    @Override
    public Optional<Author> getAuthor(int id) {
        return iAuthorRepository.findById((long) id);
    }

    @Override
    public List<Author> getAuthors() {
        return iAuthorRepository.findAll();
    }
}
