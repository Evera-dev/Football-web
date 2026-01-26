package com.vtb.goldeoro.infrastructure.persistence.entity;

import com.vtb.goldeoro.domain.model.MatchStatus;
import com.vtb.goldeoro.domain.model.Matchday;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "matches")
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_team_id")
    private TeamEntity homeTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "away_team_id")
    private TeamEntity awayTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "league_id")
    private LeagueEntity leagueEntity;

    private MatchStatus matchStatus;
    private Integer scoreHomeTeam;
    private Integer scoreAwayTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private StadiumEntity stadiumEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matchday_id")
    private MatchdayEntity matchdayEntity;

    private LocalDateTime date;

    public MatchEntity() {
    }

    public MatchEntity(Long id, TeamEntity homeTeam, TeamEntity awayTeam, LeagueEntity leagueEntity, MatchStatus matchStatus, Integer scoreHomeTeam, Integer scoreAwayTeam, StadiumEntity stadiumEntity, MatchdayEntity matchdayEntity, LocalDateTime date) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.leagueEntity = leagueEntity;
        this.matchStatus = matchStatus;
        this.scoreHomeTeam = scoreHomeTeam;
        this.scoreAwayTeam = scoreAwayTeam;
        this.stadiumEntity = stadiumEntity;
        this.matchdayEntity = matchdayEntity;
        this.date = date;
    }

    public Integer getScoreHomeTeam() {
        return scoreHomeTeam;
    }

    public void setScoreHomeTeam(Integer scoreHomeTeam) {
        this.scoreHomeTeam = scoreHomeTeam;
    }

    public Integer getScoreAwayTeam() {
        return scoreAwayTeam;
    }

    public void setScoreAwayTeam(Integer scoreAwayTeam) {
        this.scoreAwayTeam = scoreAwayTeam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeamEntity getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamEntity homeTeam) {
        this.homeTeam = homeTeam;
    }

    public TeamEntity getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamEntity awayTeam) {
        this.awayTeam = awayTeam;
    }

    public LeagueEntity getLeagueEntity() {
        return leagueEntity;
    }

    public void setLeagueEntity(LeagueEntity leagueEntity) {
        this.leagueEntity = leagueEntity;
    }

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }


    public StadiumEntity getStadiumEntity() {
        return stadiumEntity;
    }

    public void setStadiumEntity(StadiumEntity stadiumEntity) {
        this.stadiumEntity = stadiumEntity;
    }

    public MatchdayEntity getMatchdayEntity() {
        return matchdayEntity;
    }

    public void setMatchdayEntity(MatchdayEntity matchdayEntity) {
        this.matchdayEntity = matchdayEntity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
