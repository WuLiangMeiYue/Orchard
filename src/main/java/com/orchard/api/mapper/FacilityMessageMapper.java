package com.orchard.api.mapper;

import com.orchard.api.entity.FacilityMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("FacilityMessageMapper")
@Mapper
public interface FacilityMessageMapper {

    List<FacilityMessage> findAll();

    @Select("select * from facility_message where facility_message_id=#{id}")
    FacilityMessage findOneById(long id);
}
