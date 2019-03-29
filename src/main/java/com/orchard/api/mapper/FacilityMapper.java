package com.orchard.api.mapper;

import com.orchard.api.entity.Facility;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("FacilityMapper")
@Mapper
public interface FacilityMapper {

    @Select("select * from facility")
    List<Facility> findAll();

    @Select("select * from facility where facility_id=#{id}")
    Facility findOneById(long id);

}
