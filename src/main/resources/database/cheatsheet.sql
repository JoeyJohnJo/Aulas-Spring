CREATE DATABASE quiz;

CREATE TABLE quiz(
    id BIGINT PRIMARY KEY,
    name VARCHAR,
    teacher VARCHAR,
    semestre INT,
    year INT
);

INSERT INTO quiz(id, name, teacher, semestre, year) VALUES (1, 'Prova de Matemática', 'Wandin', 1, 2022);
INSERT INTO quiz(id, name, teacher, semestre, year) VALUES (2, 'Prova de História', 'Reinilton', 1, 2022);

SELECT * FROM quiz;
SELECT * FROM quiz WHERE id = 1;