package com.vtb.goldeoro.domain.model;

import java.time.LocalDateTime;

public record Match(
    Long id,
    Long homeTeamId,
    Long awayTeamId,
    Long leagueId,
    MatchStatus matchStatus,
    Integer scoreHomeTeam,
    Integer scoreAwayTeam,
    Long stadiumId,
    LocalDateTime date
) {
}
