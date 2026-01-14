package com.vtb.goldeoro.domain.model;

import java.util.List;

public record Country(
        Long id,
        Long externalId,
        Season season
) {
}
