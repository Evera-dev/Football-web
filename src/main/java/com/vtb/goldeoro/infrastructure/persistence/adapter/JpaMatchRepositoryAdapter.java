package com.vtb.goldeoro.infrastructure.persistence.adapter;

import com.vtb.goldeoro.application.port.out.MatchRepositoryPort;
import com.vtb.goldeoro.domain.model.Match;
import com.vtb.goldeoro.domain.model.MatchStatus;
import com.vtb.goldeoro.infrastructure.persistence.repository.SpringDataMatchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaMatchRepositoryAdapter implements MatchRepositoryPort {
    private final SpringDataMatchRepository springDataMatchRepository;

    public JpaMatchRepositoryAdapter(SpringDataMatchRepository springDataMatchRepository) {
        this.springDataMatchRepository = springDataMatchRepository;
    }

    @Override
    public List<Match> findCurrentMatches() {
        return springDataMatchRepository.findAllByMatchStatus(MatchStatus.UPCOMING);
    }
}
