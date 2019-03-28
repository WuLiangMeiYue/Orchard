package com.orchard.api.mapper;

import com.orchard.api.entity.Threshold;

import java.util.List;

public interface ThresholdMapper {

    List<Threshold> findAll();

    Threshold findOneById(long id);
}
