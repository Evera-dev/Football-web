package com.vtb.goldeoro.domain.model;

import java.time.LocalDateTime;

public record Match(
    Long id,
    Team homeTeamId,
    Team awayTeamId,
    League leagueId,
    MatchStatus matchStatus,
    Matchday matchday,
    Score score,
    Stadium stadium,
    LocalDateTime date
) {
}
