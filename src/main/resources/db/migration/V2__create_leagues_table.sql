CREATE TABLE leagues (
                         id BIGSERIAL PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         official_name VARCHAR(255),
                         season_id BIGINT,
                         CONSTRAINT fk_league_season
                             FOREIGN KEY (season_id) REFERENCES seasons(id)
);