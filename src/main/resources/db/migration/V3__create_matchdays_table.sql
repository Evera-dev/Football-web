CREATE TABLE matchdays (
                           id BIGSERIAL PRIMARY KEY,
                           name VARCHAR(100),
                           league_id BIGINT,
                           CONSTRAINT fk_matchday_league
                               FOREIGN KEY (league_id) REFERENCES leagues(id)
);