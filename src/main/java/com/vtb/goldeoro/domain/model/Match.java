package com.vtb.goldeoro.domain.model;

import java.time.LocalDateTime;

public record Match(
    Long id,
    Long homeTeamId,
    Long awayTeamId,
    Long leagueId,
    MatchStatus matchStatus,
    Long scoreHomeTeam,
    Long scoreAwayTeam,
    Long stadiumId,
    LocalDateTime date
) {
}
