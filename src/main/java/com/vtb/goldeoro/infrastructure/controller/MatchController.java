package com.vtb.goldeoro.infrastructure.controller;

import com.vtb.goldeoro.application.port.in.FindCurrentMatchesUseCase;
import com.vtb.goldeoro.infrastructure.controller.dto.MatchDtoResponse;
import com.vtb.goldeoro.infrastructure.persistence.mapper.MatchWebMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/match")
public class MatchController {
    private final MatchWebMapper matchWebMapper;
    private final FindCurrentMatchesUseCase findCurrentMatchesUseCase;

    public MatchController(MatchWebMapper matchWebMapper, FindCurrentMatchesUseCase findCurrentMatchesUseCase) {
        this.matchWebMapper = matchWebMapper;
        this.findCurrentMatchesUseCase = findCurrentMatchesUseCase;
    }

    @GetMapping
    public List<MatchDtoResponse> getCurrentMatches() {
        return matchWebMapper.toResponseList(findCurrentMatchesUseCase.findCurrentMatches());
    }
}
