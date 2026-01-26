package com.vtb.goldeoro.application.port.in;

import com.vtb.goldeoro.domain.model.League;

import java.util.List;

public interface FindCurrentMatchesUseCase {
    List<League> findCurrentMatches();
}
