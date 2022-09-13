package com.example.jwtspringboot.service.impl;

import com.example.jwtspringboot.model.Blog;
import com.example.jwtspringboot.repository.BlogRepository;
import com.example.jwtspringboot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    BlogRepository blogRepository;
    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

}
