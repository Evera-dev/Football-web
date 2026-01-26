package com.vtb.goldeoro.application.port.out;

import com.vtb.goldeoro.domain.model.Match;

import java.util.List;

public interface MatchRepositoryPort {
    List<Match> findCurrentMatches();
}
