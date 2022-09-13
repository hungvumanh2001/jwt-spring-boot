package com.example.jwtspringboot.service;

import com.example.jwtspringboot.model.Blog;

public interface IBlogService extends IService<Blog>{
    Iterable<Blog> findAllByContentContains(String content);
}
