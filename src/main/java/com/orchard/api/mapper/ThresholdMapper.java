package com.orchard.api.mapper;

import com.orchard.api.entity.Threshold;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ThresholdMapper")
@Mapper
public interface ThresholdMapper {

    @Select("select * from threshold")
    List<Threshold> findAll();

    @Select("select * from threshold where threshold_id=#{id}")
    Threshold findOneById(long id);
}
