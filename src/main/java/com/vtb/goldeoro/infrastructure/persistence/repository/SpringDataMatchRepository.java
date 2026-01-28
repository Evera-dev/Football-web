package com.vtb.goldeoro.infrastructure.persistence.repository;

import com.vtb.goldeoro.domain.model.MatchStatus;
import com.vtb.goldeoro.infrastructure.persistence.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataMatchRepository extends JpaRepository<MatchEntity, Long> {
    List<MatchEntity> findAllByMatchStatus(MatchStatus matchStatus);
}