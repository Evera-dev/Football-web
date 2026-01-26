package com.vtb.goldeoro.infrastructure.persistence.adapter;

import com.vtb.goldeoro.application.port.out.LeagueRepositoryPort;
import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.infrastructure.persistence.repository.SpringDataLeagueRepository;
import com.vtb.goldeoro.infrastructure.persistence.entity.LeagueEntity;
import com.vtb.goldeoro.infrastructure.persistence.mapper.LeaguePersistenceMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaLeagueRepositoryAdapter implements LeagueRepositoryPort {
    private final SpringDataLeagueRepository springDataLeagueRepository;
    private final LeaguePersistenceMapper leaguePersistenceMapper;

    public JpaLeagueRepositoryAdapter(SpringDataLeagueRepository springDataLeagueRepository, LeaguePersistenceMapper leaguePersistenceMapper) {
        this.springDataLeagueRepository = springDataLeagueRepository;
        this.leaguePersistenceMapper = leaguePersistenceMapper;
    }

    @Override
    public League save(League league) {
        return null;
    }

    @Override
    public List<League> findAll() {
        List<LeagueEntity> leaguesEntity = springDataLeagueRepository.findAll();
        return leaguePersistenceMapper.toResponseList(leaguesEntity);
    }

    @Override
    public League findAllById(Long id) {
        // TODO: Implementar búsqueda por ID con manejo de Optional
        return null;
    }
}
