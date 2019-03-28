package com.orchard.api.mapper;

import com.orchard.api.entity.FacilityMessage;

import java.util.List;

public interface FacilityMessageMapper {

    List<FacilityMessage> findAll();

    FacilityMessage findOneById(long id);
}
