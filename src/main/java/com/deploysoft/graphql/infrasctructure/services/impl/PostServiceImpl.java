package com.deploysoft.graphql.infrasctructure.services.impl;

import com.deploysoft.graphql.infrasctructure.repository.IPostRepository;
import com.deploysoft.graphql.infrasctructure.repository.entity.Post;
import com.deploysoft.graphql.infrasctructure.services.IPostService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements IPostService {

    private final IPostRepository iPostRepository;

    public PostServiceImpl(IPostRepository iPostRepository) {
        this.iPostRepository = iPostRepository;
    }

    @Override
    @Transactional
    public Post createPost(Post post) {
        return this.iPostRepository.saveAndFlush(post);
    }

    @Override
    public Optional<Post> getPost(Long id) {
        return this.iPostRepository.findById(id);
    }

    @Override
    public List<Post> getPosts() {
        return this.iPostRepository.findAll();
    }
}
