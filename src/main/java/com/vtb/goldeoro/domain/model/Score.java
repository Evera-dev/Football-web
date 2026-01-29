package com.vtb.goldeoro.domain.model;

public record Score(
    Long id,
    Integer fullTimeHome,
    Integer fullTimeAway,
    Integer halfTimeHome,
    Integer extraTimeHome,
    Integer extraTimeAway,
    Integer penaltyHome,
    Integer penaltyAway,
    Match match
) {
}
