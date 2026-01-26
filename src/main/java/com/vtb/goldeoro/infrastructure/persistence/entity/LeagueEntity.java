package com.vtb.goldeoro.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "leagues")
public class LeagueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "official_name")
    private String officialName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "season_id")
    private SeasonEntity season;

    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MatchdayEntity> matchdays;

    @OneToMany(mappedBy = "leagueEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MatchEntity> listMatches;

    public LeagueEntity() {
    }

    public LeagueEntity(Long id, String name, String officialName, SeasonEntity season, List<MatchdayEntity> matchdays, List<MatchEntity> listMatches) {
        this.id = id;
        this.name = name;
        this.officialName = officialName;
        this.season = season;
        this.matchdays = matchdays;
        this.listMatches = listMatches;
    }

    public List<MatchEntity> getListMatches() {
        return listMatches;
    }

    public void setListMatches(List<MatchEntity> listMatches) {
        this.listMatches = listMatches;
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

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public SeasonEntity getSeason() {
        return season;
    }

    public void setSeason(SeasonEntity season) {
        this.season = season;
    }

    public List<MatchdayEntity> getMatchdays() {
        return matchdays;
    }

    public void setMatchdays(List<MatchdayEntity> matchdays) {
        this.matchdays = matchdays;
    }
}
