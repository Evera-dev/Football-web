package com.vtb.goldeoro.infrastructure.controller.dto;

import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.domain.model.MatchStatus;
import com.vtb.goldeoro.domain.model.Stadium;
import com.vtb.goldeoro.domain.model.Team;

import java.time.LocalDateTime;

public record MatchDtoResponse(
        Long id,
        Team homeTeam,
        Team awayTeam,
        League league,
        MatchStatus matchStatus,
        Integer scoreHomeTeam,
        Integer scoreAwayTeam,
        Stadium stadium,
        LocalDateTime date
) {
}
