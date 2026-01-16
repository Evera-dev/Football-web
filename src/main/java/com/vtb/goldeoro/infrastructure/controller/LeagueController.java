package com.vtb.goldeoro.infrastructure.controller;

import com.vtb.goldeoro.application.port.in.FindAllLeaguesUseCase;
import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.infrastructure.controller.dto.LeagueResponse;
import com.vtb.goldeoro.infrastructure.persistence.mapper.LeagueWebMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/leagues")
public class LeagueController {
    private final FindAllLeaguesUseCase findAllLeaguesUseCase;
    private final LeagueWebMapper leagueWebMapper;

    public LeagueController(FindAllLeaguesUseCase findAllLeaguesUseCase, LeagueWebMapper leagueWebMapper) {
        this.findAllLeaguesUseCase = findAllLeaguesUseCase;
        this.leagueWebMapper = leagueWebMapper;
    }

    @GetMapping
    public List<LeagueResponse> findAll() {
        List<League> leagues = findAllLeaguesUseCase.execute();
        return leagueWebMapper.toResponseList(leagues);
    }
}
