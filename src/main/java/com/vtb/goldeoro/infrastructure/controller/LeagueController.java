package com.vtb.goldeoro.infrastructure.controller;

import com.vtb.goldeoro.application.port.in.FindAllLeaguesUseCase;
import com.vtb.goldeoro.domain.model.League;
import com.vtb.goldeoro.infrastructure.controller.dto.LeagueResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/leagues")
public class LeagueController {
    private final FindAllLeaguesUseCase findAllLeaguesUseCase;

    public LeagueController(FindAllLeaguesUseCase findAllLeaguesUseCase) {
        this.findAllLeaguesUseCase = findAllLeaguesUseCase;
    }

    @GetMapping
    public List<LeagueResponse> findAll() {
        List<League> leagues = findAllLeaguesUseCase.findAll();
        List<LeagueResponse> leagueResponses = new ArrayList<>();
        for(League league : leagues){
            leagueResponses.add(new LeagueResponse(league.id(), league.name(), league.officialName()));
        }
        return leagueResponses;
    }
}
