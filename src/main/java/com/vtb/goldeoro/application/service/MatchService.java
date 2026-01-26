package com.vtb.goldeoro.application.service;

import com.vtb.goldeoro.application.port.in.FindCurrentMatchesUseCase;
import com.vtb.goldeoro.domain.model.League;

import java.util.List;

public class MatchService implements FindCurrentMatchesUseCase {
    @Override
    public List<League> findCurrentMatches() {
        return List.of();
    }
}
