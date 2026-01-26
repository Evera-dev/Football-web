package com.vtb.goldeoro.application.service;

import com.vtb.goldeoro.application.port.in.FindAllLeaguesUseCase;
import com.vtb.goldeoro.application.port.in.FindCurrentMatchesUseCase;
import com.vtb.goldeoro.application.port.out.LeagueRepositoryPort;
import com.vtb.goldeoro.domain.model.League;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService implements FindAllLeaguesUseCase {

    private final LeagueRepositoryPort leagueRepositoryPort;

    public LeagueService(LeagueRepositoryPort leagueRepositoryPort) {
        this.leagueRepositoryPort = leagueRepositoryPort;
    }

    @Override
    public List<League> findAllLeagues() {
        return leagueRepositoryPort.findAll();
    }
}
