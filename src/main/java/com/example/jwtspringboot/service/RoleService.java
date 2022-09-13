package com.example.jwtspringboot.service;


import com.example.jwtspringboot.model.Role;


public interface RoleService {
    Iterable<Role> findAll();


    void save(Role role);

    Role findByName(String name);
}
