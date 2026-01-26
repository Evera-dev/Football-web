package com.vtb.goldeoro.infrastructure.persistence.repository;

import com.vtb.goldeoro.infrastructure.persistence.entity.LeagueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataLeagueRepository extends JpaRepository<LeagueEntity, Long> {
}
