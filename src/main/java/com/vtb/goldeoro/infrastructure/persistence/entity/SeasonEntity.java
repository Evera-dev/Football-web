package com.vtb.goldeoro.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "seasons")
public class SeasonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String year;

    @OneToMany(mappedBy = "season", fetch = FetchType.LAZY)
    private List<LeagueEntity> leagues;

    public SeasonEntity() {
    }

    public SeasonEntity(Long id, String year, List<LeagueEntity> leagues) {
        this.id = id;
        this.year = year;
        this.leagues = leagues;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<LeagueEntity> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<LeagueEntity> leagues) {
        this.leagues = leagues;
    }
}