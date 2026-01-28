package com.vtb.goldeoro.application.port.in;

import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.domain.model.Match;

import java.util.List;

public interface FindCurrentMatchesUseCase {
    List<Match> findCurrentMatches();
}
