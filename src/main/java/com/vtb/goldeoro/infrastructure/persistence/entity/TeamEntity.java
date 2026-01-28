package com.vtb.goldeoro.infrastructure.persistence.entity;

import com.vtb.goldeoro.domain.model.Match;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name ="teams")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nickname;
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "homeTeam")
    private List<MatchEntity> ListMatchesHome;

    @OneToMany(mappedBy = "awayTeam")
    private List<MatchEntity> ListMatchesAway;

    @ManyToMany(mappedBy = "teamEntityList")
    private List<StadiumEntity> stadiumsList;

    public TeamEntity() {
    }

    public TeamEntity(Long id, String name, String nickname, LocalDate foundationDate, List<MatchEntity> listMatchesHome, List<MatchEntity> listMatchesAway, List<StadiumEntity> stadiumsList) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.foundationDate = foundationDate;
        ListMatchesHome = listMatchesHome;
        ListMatchesAway = listMatchesAway;
        this.stadiumsList = stadiumsList;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public List<MatchEntity> getListMatchesHome() {
        return ListMatchesHome;
    }

    public void setListMatchesHome(List<MatchEntity> listMatchesHome) {
        ListMatchesHome = listMatchesHome;
    }

    public List<MatchEntity> getListMatchesAway() {
        return ListMatchesAway;
    }

    public void setListMatchesAway(List<MatchEntity> listMatchesAway) {
        ListMatchesAway = listMatchesAway;
    }

    public List<StadiumEntity> getStadiumsList() {
        return stadiumsList;
    }

    public void setStadiumsList(List<StadiumEntity> stadiumsList) {
        this.stadiumsList = stadiumsList;
    }
}
