package com.deploysoft.graphql.infrasctructure.services;

import com.deploysoft.graphql.infrasctructure.repository.entity.Post;

import java.util.List;
import java.util.Optional;

public interface IPostService {

    Post createPost(final Post post);

    Optional<Post> getPost(final Long id);

    List<Post> getPosts();
}
