package com.michaelalizade.activity_tracker.repository;

import com.michaelalizade.activity_tracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // todo: think of usage I guess. Still need to set up a database

}
