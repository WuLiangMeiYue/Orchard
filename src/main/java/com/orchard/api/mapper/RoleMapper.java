package com.orchard.api.mapper;

import com.orchard.api.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("RoleMapper")
@Mapper
public interface RoleMapper {
    @Select("select * from role")
    List<Role> findAll();

    @Select("select * from role where role_id=#{id}")
    Role findOneById(long id);
}
