package com.vtb.goldeoro.application.port.out;

import com.vtb.goldeoro.domain.model.League;

import java.util.List;

public interface LeagueRepositoryPort {
    League save(League league);
    List<League> findAll();
    League findAllById(Long id);
}
