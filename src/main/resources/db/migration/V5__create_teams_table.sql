CREATE TABLE teams (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    nickname VARCHAR(30) NOT NULL,
    foundation_date DATE
);