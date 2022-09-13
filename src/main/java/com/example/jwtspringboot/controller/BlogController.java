package com.example.jwtspringboot.controller;

import com.example.jwtspringboot.model.Blog;
import com.example.jwtspringboot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    IBlogService blogService;
    @GetMapping
    public ResponseEntity findAll(){
        return new ResponseEntity(blogService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity save(@RequestBody Blog blog){
        blogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return new ResponseEntity(blogService.findById(id), HttpStatus.OK);
    }
}
