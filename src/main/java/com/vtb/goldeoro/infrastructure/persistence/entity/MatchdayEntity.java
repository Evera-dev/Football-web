package com.vtb.goldeoro.infrastructure.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "matchdays")
public class MatchdayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "league_id")
    private LeagueEntity league;
}
