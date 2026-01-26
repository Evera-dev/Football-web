CREATE TABLE matches (
       id BIGSERIAL PRIMARY KEY,

       home_team_id BIGINT,
       CONSTRAINT fk_match_home_team
           FOREIGN KEY (home_team_id) REFERENCES teams(id),

       away_team_id BIGINT,
       CONSTRAINT fk_match_away_team
           FOREIGN KEY (away_team_id) REFERENCES teams(id),

       league_id BIGINT,
       CONSTRAINT fk_match_league
           FOREIGN KEY (league_id) REFERENCES leagues(id),

       match_status VARCHAR,
       score_home_team INT,
       score_away_team INT,

       stadium_id BIGINT,
       CONSTRAINT fk_match_stadium
           FOREIGN KEY (stadium_id) REFERENCES stadiums(id),

       matchday_id BIGINT,
       CONSTRAINT fk_match_matchayday
           FOREIGN KEY (matchday_id) REFERENCES matchdays(id),

       date DATE


);
