package com.vtb.goldeoro.infrastructure.persistence.repository;

import com.vtb.goldeoro.infrastructure.persistence.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataMatchRepository extends JpaRepository<MatchEntity, Long> {
}
