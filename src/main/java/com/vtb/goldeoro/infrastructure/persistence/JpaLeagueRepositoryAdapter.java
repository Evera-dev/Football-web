package com.vtb.goldeoro.infrastructure.persistence;

import com.vtb.goldeoro.application.port.out.LeagueRepositoryPort;
import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.domain.model.Match;
import com.vtb.goldeoro.infrastructure.persistence.entity.LeagueEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JpaLeagueRepositoryAdapter implements LeagueRepositoryPort {
    private final SpringDataLeagueRepository springDataLeagueRepository;

    public JpaLeagueRepositoryAdapter(SpringDataLeagueRepository springDataLeagueRepository) {
        this.springDataLeagueRepository = springDataLeagueRepository;
    }

    @Override
    public League save(League league) {
        return null;
    }

    @Override
    public List<League> findAll() {
        List<LeagueEntity> leaguesEntity = springDataLeagueRepository.findAll();
        List<League> leagues = new ArrayList<>();
        for (LeagueEntity leagueEntity : leaguesEntity){
            leagues.add(new League(leagueEntity.getId(), leagueEntity.getName(), leagueEntity.getOfficialName(), null, leagueEntity.getSeason().getId()));
        }
        return leagues;
    }

    @Override
    public League findAllById(Long id) {
        return null;
    }
}
