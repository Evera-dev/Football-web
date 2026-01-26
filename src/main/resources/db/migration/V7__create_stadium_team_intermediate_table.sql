CREATE TABLE teams_stadiums (
    team_id BIGINT REFERENCES teams(id) ON DELETE CASCADE,
    stadium_id BIGINT REFERENCES stadiums(id) ON DELETE CASCADE,
    PRIMARY KEY (team_id, stadium_id)
);