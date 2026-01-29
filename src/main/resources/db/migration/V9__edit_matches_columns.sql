ALTER table matches
DROP COLUMN score_home_team;

ALTER table matches
DROP COLUMN score_away_team;

ALTER TABLE matches
    ADD COLUMN full_time_home INT,
    ADD COLUMN full_time_away INT,
    ADD COLUMN half_time_home INT,
    ADD COLUMN half_time_away INT,
    ADD COLUMN extra_time_home INT,
    ADD COLUMN extra_time_away INT,
    ADD COLUMN penalties_home INT,
    ADD COLUMN penalties_away INT;