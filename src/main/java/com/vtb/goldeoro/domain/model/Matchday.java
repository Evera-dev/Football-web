package com.vtb.goldeoro.domain.model;

import java.util.List;

public record Matchday(
        Long id,
        List<Match> matchList
) {
}
