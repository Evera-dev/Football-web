package com.vtb.goldeoro.infrastructure.persistence.adapter;

import com.vtb.goldeoro.application.port.out.MatchRepositoryPort;
import com.vtb.goldeoro.domain.model.Match;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaMatchRepositoryAdapter implements MatchRepositoryPort {
    @Override
    public List<Match> findCurrentMatches() {
        return List.of();
    }
}
