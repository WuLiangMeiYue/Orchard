package com.orchard.api.mapper;

import com.orchard.api.entity.Permission;

import java.util.List;

public interface PermissionMapper {

    List<Permission> findAll();

    Permission findOneById(long id);
}
