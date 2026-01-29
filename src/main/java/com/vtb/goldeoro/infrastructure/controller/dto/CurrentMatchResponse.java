package com.vtb.goldeoro.infrastructure.controller.dto;

import java.util.List;

public record CurrentMatchResponse(
   LeagueResponse league,
   List<MatchDtoResponse> currentMatches
) {}
