package com.vtb.goldeoro.infrastructure.persistence.mapper;

import com.vtb.goldeoro.domain.model.Match;
import com.vtb.goldeoro.infrastructure.persistence.entity.MatchEntity;

import java.util.List;

public interface MatchPersistenceMapper {
    Match toResponse(MatchEntity matchEntity);
    List<Match> toResponseList(List<MatchEntity> matchEntityList);
}