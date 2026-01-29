package com.vtb.goldeoro.infrastructure.persistence.mapper;

import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.infrastructure.controller.dto.LeagueResponse;
import com.vtb.goldeoro.infrastructure.persistence.entity.LeagueEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LeaguePersistenceMapper {
    League toDomain(LeagueEntity leagueEntity);
    List<League> toDomainList(List<LeagueEntity> leagueEntityList);
}
