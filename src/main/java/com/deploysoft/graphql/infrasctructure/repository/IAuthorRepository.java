package com.deploysoft.graphql.infrasctructure.repository;

import com.deploysoft.graphql.infrasctructure.repository.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Author, Long> {
}
