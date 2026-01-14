package com.vtb.goldeoro.infrastructure.scraper;

import com.vtb.goldeoro.application.port.out.ParaguayLeagueProvider;
import com.vtb.goldeoro.domain.model.Match;
import org.springframework.stereotype.Component;

import java.net.http.HttpResponse;
import java.util.List;

@Component
public class ParaguayLeagueAdapter implements ParaguayLeagueProvider {

    @Override
    public List<Match> scrapeActiveMatches() {
        return null;
    }
}
