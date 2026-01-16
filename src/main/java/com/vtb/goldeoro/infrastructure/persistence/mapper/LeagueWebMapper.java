package com.vtb.goldeoro.infrastructure.persistence.mapper;

import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.infrastructure.controller.dto.LeagueResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LeagueWebMapper {
    LeagueResponse toResponse(League domainLeague);
    List<LeagueResponse> toResponseList(List<League> domainLeague);
}
