package com.vtb.goldeoro.domain.model;

import java.time.LocalDate;

public record Stadium(
        Long id,
        String name,
        String officialName,
        LocalDate foundationDate
) {
}
