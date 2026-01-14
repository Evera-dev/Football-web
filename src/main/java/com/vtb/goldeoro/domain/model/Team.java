package com.vtb.goldeoro.domain.model;

import java.time.LocalDate;

public record Team(
        Long id,
        String name,
        String nickname,
        LocalDate foundationDate
) {
}
