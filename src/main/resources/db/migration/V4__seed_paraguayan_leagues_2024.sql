
INSERT INTO seasons (year)
VALUES ('2024');

INSERT INTO leagues (name, official_name, season_id)
VALUES
    ('Clausura', 'Division Profesional - Clausura', (SELECT id FROM seasons WHERE year = '2024')),
    ('Apertura', 'Division Profesional - Apertura', (SELECT id FROM seasons WHERE year = '2024')),
    ('Intermedia', 'Division Intermedia', (SELECT id FROM seasons WHERE year = '2024')),
    ('Copa Paraguay', 'Copa Paraguay', (SELECT id FROM seasons WHERE year = '2024')),
    ('Supercopa', 'Supercopa', (SELECT id FROM seasons WHERE year = '2024'));