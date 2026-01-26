package com.vtb.goldeoro.domain.model;

import java.time.LocalDate;
import java.util.List;

public record Team(
        Long id,
        String name,
        String nickname,
        LocalDate foundationDate,
        List<Stadium> stadiumList
) {
}
