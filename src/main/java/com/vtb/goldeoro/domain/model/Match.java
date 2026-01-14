package com.vtb.goldeoro.domain.model;

import java.time.LocalDateTime;

public record Match(
    Long id,
    Team homeTeam,
    Team awayTeam,
    League league,
    MatchStatus matchStatus,
    Long scoreHomeTeam,
    Long scoreAwayTeam,
    Stadium stadium,
    LocalDateTime date
) {
}
