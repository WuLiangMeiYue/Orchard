package com.orchard.api.mapper;

import com.orchard.api.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("PermissionMapper")
@Mapper
public interface PermissionMapper {

    List<Permission> findAll();

    @Select("select * from permission where permission_id=#{id}")
    Permission findOneById(long id);
}
