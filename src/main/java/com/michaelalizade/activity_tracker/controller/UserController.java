package com.michaelalizade.activity_tracker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @PostMapping
    public long createUser(){ // todo: figure out responseentity return type
        long id = userService.createUser();
        return id;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }
}
