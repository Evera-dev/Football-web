package com.vtb.goldeoro.infrastructure.persistence.mapper;

import com.vtb.goldeoro.domain.model.Match;
import com.vtb.goldeoro.infrastructure.controller.dto.MatchDtoResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MatchWebMapper {
    MatchDtoResponse toResponse(Match domainLeague);
    List<MatchDtoResponse> toResponseList(List<Match> domainLeagueList);
}