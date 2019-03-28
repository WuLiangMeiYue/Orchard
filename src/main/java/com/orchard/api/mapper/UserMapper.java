package com.orchard.api.mapper;

import com.orchard.api.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    User findOneById(long id);

}
