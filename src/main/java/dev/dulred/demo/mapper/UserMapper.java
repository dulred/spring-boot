package dev.dulred.demo.mapper;

import org.springframework.stereotype.Repository;

import dev.dulred.demo.entity.User;

@Repository
public interface UserMapper {

    User selectOne(int id);
    
}
