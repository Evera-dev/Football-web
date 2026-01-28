package com.vtb.goldeoro.application.service;

import com.vtb.goldeoro.application.port.in.FindCurrentMatchesUseCase;
import com.vtb.goldeoro.application.port.out.MatchRepositoryPort;
import com.vtb.goldeoro.domain.model.Match;

import java.util.List;

public class MatchService implements FindCurrentMatchesUseCase {
    private final MatchRepositoryPort matchRepositoryPort;

    public MatchService(MatchRepositoryPort matchRepositoryPort) {
        this.matchRepositoryPort = matchRepositoryPort;
    }

    @Override
    public List<Match> findCurrentMatches() {
        return matchRepositoryPort.findCurrentMatches();
    }
}
