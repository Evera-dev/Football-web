package com.vtb.goldeoro.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "match")
    private List<MatchEntity> matchEntityList;

    public MatchdayEntity() {
    }

    public MatchdayEntity(Long id, String name, LeagueEntity league, List<MatchEntity> matchEntityList) {
        this.id = id;
        this.name = name;
        this.league = league;
        this.matchEntityList = matchEntityList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LeagueEntity getLeague() {
        return league;
    }

    public void setLeague(LeagueEntity league) {
        this.league = league;
    }

    public List<MatchEntity> getMatchEntityList() {
        return matchEntityList;
    }

    public void setMatchEntityList(List<MatchEntity> matchEntityList) {
        this.matchEntityList = matchEntityList;
    }
}
