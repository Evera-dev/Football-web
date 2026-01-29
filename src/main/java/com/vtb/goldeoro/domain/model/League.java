package com.vtb.goldeoro.domain.model;

import java.util.List;

public record League(
    Long id,
    String name,
    String officialName,
    List<Matchday> matchdayList,
    Season season
) {
}
