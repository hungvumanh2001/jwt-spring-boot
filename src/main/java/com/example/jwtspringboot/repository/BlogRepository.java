package com.example.jwtspringboot.repository;

import com.example.jwtspringboot.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
    Iterable<Blog> findAllByContentContains(String content);
}
