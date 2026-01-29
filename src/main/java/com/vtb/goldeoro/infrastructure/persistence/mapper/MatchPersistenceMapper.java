package com.vtb.goldeoro.infrastructure.persistence.mapper;

import com.vtb.goldeoro.domain.model.Match;
import com.vtb.goldeoro.infrastructure.persistence.entity.MatchEntity;

import java.util.List;

public interface MatchPersistenceMapper {
    Match toDomain(MatchEntity matchEntity);
    List<Match> toDomainList(List<MatchEntity> matchEntityList);
}