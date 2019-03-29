package com.orchard.api.mapper;

import com.orchard.api.entity.Test;
import com.orchard.api.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserMapper")
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where user_id=#{id}")
    User findOneById(long id);

    @Select("select * from user")
    List<Test> findtestAll();

}
