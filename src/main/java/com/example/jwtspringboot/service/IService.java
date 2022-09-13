package com.example.jwtspringboot.service;

import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IService<T> {
    public void save(T t);
    public Iterable<T> findAll();
    public Optional<T> findById(Long id);
    public void remove(Long id);
}
