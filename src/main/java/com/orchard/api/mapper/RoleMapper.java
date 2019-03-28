package com.orchard.api.mapper;

import com.orchard.api.entity.Role;

import java.util.List;

public interface RoleMapper {

    List<Role> findAll();

    Role findOneById(long id);
}
