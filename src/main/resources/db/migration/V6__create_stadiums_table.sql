CREATE TABLE stadiums (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    official_name VARCHAR(30) NOT NULL,
    foundation_date DATE
);