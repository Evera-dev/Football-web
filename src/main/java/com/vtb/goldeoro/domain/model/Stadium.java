package com.vtb.goldeoro.domain.model;

import java.time.LocalDate;
import java.util.List;

public record Stadium(
        Long id,
        String name,
        String officialName,
        LocalDate foundationDate,
        List<Team> teamList
) {
}
