package com.deploysoft.graphql.infrasctructure.repository;

import com.deploysoft.graphql.infrasctructure.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post, Long> {
}
