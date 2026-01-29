package com.vtb.goldeoro.infrastructure.persistence.mapper;

import com.vtb.goldeoro.domain.model.Match;
import com.vtb.goldeoro.infrastructure.controller.dto.CurrentMatchResponse;
import com.vtb.goldeoro.infrastructure.controller.dto.LeagueResponse;
import com.vtb.goldeoro.infrastructure.controller.dto.MatchDtoResponse;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MatchWebMapper {
    MatchDtoResponse toResponse(Match domainLeague);
    List<MatchDtoResponse> toResponseList(List<Match> domainLeagueList);
    CurrentMatchResponse toCurrentMatchResponse(MatchDtoResponse match, LeagueResponse leeague);

    default List<CurrentMatchResponse> toCurrentMatchResponseList(List<MatchDtoResponse> matchList) {

        List<CurrentMatchResponse> result = new ArrayList<>();

//        for(MatchDtoResponse match : matchList) {
//            result.add(match, match.league())
//        }

        return result;
    }
}