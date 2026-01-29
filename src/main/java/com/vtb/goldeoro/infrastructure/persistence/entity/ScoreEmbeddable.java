package com.vtb.goldeoro.infrastructure.persistence.entity;

import jakarta.persistence.*;

@Embeddable
public class ScoreEmbeddable {

    private Integer fullTimeHome;
    private Integer fullTimeAway;
    private Integer halfTimeHome;
    private Integer halfTimeAway;
    private Integer extraTimeHome;
    private Integer extraTimeAway;
    private Integer penaltiesHome;
    private Integer penaltiesAway;

    @OneToOne
    private MatchEntity matchEntity;

    public ScoreEmbeddable() {
    }


    public ScoreEmbeddable(MatchEntity matchEntity, Integer penaltiesAway, Integer penaltiesHome, Integer extraTimeAway, Integer extraTimeHome, Integer halfTimeAway, Integer halfTimeHome, Integer fullTimeAway, Integer fullTimeHome) {
        this.matchEntity = matchEntity;
        this.penaltiesAway = penaltiesAway;
        this.penaltiesHome = penaltiesHome;
        this.extraTimeAway = extraTimeAway;
        this.extraTimeHome = extraTimeHome;
        this.halfTimeAway = halfTimeAway;
        this.halfTimeHome = halfTimeHome;
        this.fullTimeAway = fullTimeAway;
        this.fullTimeHome = fullTimeHome;
    }

    public Integer getHalfTimeAway() {
        return halfTimeAway;
    }

    public void setHalfTimeAway(Integer halfTimeAway) {
        this.halfTimeAway = halfTimeAway;
    }

    public MatchEntity getMatchEntity() {
        return matchEntity;
    }

    public void setMatchEntity(MatchEntity matchEntity) {
        this.matchEntity = matchEntity;
    }

    public Integer getFullTimeHome() {
        return fullTimeHome;
    }

    public void setFullTimeHome(Integer fullTimeHome) {
        this.fullTimeHome = fullTimeHome;
    }

    public Integer getFullTimeAway() {
        return fullTimeAway;
    }

    public void setFullTimeAway(Integer fullTimeAway) {
        this.fullTimeAway = fullTimeAway;
    }

    public Integer getHalfTimeHome() {
        return halfTimeHome;
    }

    public void setHalfTimeHome(Integer halfTimeHome) {
        this.halfTimeHome = halfTimeHome;
    }

    public Integer getExtraTimeHome() {
        return extraTimeHome;
    }

    public void setExtraTimeHome(Integer extraTimeHome) {
        this.extraTimeHome = extraTimeHome;
    }

    public Integer getExtraTimeAway() {
        return extraTimeAway;
    }

    public void setExtraTimeAway(Integer extraTimeAway) {
        this.extraTimeAway = extraTimeAway;
    }

    public Integer getPenaltiesHome() {
        return penaltiesHome;
    }

    public void setPenaltiesHome(Integer penaltiesHome) {
        this.penaltiesHome = penaltiesHome;
    }

    public Integer getPenaltiesAway() {
        return penaltiesAway;
    }

    public void setPenaltiesAway(Integer penaltiesAway) {
        this.penaltiesAway = penaltiesAway;
    }
}
