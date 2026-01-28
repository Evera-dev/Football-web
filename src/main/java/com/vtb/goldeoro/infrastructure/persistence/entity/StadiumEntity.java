package com.vtb.goldeoro.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "stadiums")
public class StadiumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "official_name")
    private String officialName;
    private LocalDate foundationDate;

    @ManyToMany
    @JoinTable(
            name = "stadium_team",
            joinColumns = @JoinColumn(name = "stadium_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private List<TeamEntity> teamEntityList;

    @OneToMany(mappedBy = "stadiumEntity")
    private List<MatchEntity> listMatches;

    public StadiumEntity() {
    }

    public StadiumEntity(Long id, String name, String officialName, LocalDate foundationDate, List<TeamEntity> teamEntityList, List<MatchEntity> listMatches) {
        this.id = id;
        this.name = name;
        this.officialName = officialName;
        this.foundationDate = foundationDate;
        this.teamEntityList = teamEntityList;
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

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public List<TeamEntity> getTeamEntityList() {
        return teamEntityList;
    }

    public void setTeamEntityList(List<TeamEntity> teamEntityList) {
        this.teamEntityList = teamEntityList;
    }

    public List<MatchEntity> getListMatches() {
        return listMatches;
    }

    public void setListMatches(List<MatchEntity> listMatches) {
        this.listMatches = listMatches;
    }
}
