package com.vtb.goldeoro.application.service;

import com.vtb.goldeoro.application.port.in.UpdateCurrentMatchesUseCase;
import com.vtb.goldeoro.application.port.out.ParaguayLeagueProvider;
import org.springframework.stereotype.Service;

@Service
public class UpdateMatchesService implements UpdateCurrentMatchesUseCase {
    private final ParaguayLeagueProvider matchProvider;

    public UpdateMatchesService(ParaguayLeagueProvider matchProvider) {
        this.matchProvider = matchProvider;
    }

    @Override
    public void updateCurrentMatches() {
        matchProvider.scrapeActiveMatches();
    }
}
