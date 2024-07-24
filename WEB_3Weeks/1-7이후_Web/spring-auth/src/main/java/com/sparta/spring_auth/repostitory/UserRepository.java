package com.sparta.spring_auth.repostitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.spring_auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
