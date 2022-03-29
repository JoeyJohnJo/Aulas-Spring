CREATE DATABASE quiz; -- Criar banco de dados

-- Criar sequencia para o id da tabela quiz
CREATE SEQUENCE quiz_id_seq START WITH 1 INCREMENT 1; -- Inicia no 1 e o proximo sera o anterior + 1

-- Criar tabelas dentro do banco de dados
CREATE TABLE quiz(
    id BIGINT PRIMARY KEY DEFAULT nextval('quiz_id_seq'), -- Tipo Long, Modificadores: Não nulo, Chave primária (não pode repetir), Valor padrão: nextval('quiz_id_seq')
    name VARCHAR NOT NULL, -- Tipo String, Modificadores: Não nulo
    teacher VARCHAR, -- Tipo String
    semestre INT, -- Tipo Int
    year INT -- Tipo Int
);

-- Inserir uma nova linha na tabela
INSERT INTO quiz(name, teacher, semestre, year) VALUES ('Prova de Matemática', 'Wandin', 1, 2022);
INSERT INTO quiz(name, teacher, semestre, year) VALUES ('Prova de História', 'Reinilton', 1, 2022);

SELECT * FROM quiz; -- Selecionar todos os registros da tabela
SELECT name FROM quiz; -- Selecionar os nomes dos registros da tabela
SELECT id, name FROM quiz; -- Selecione o id e o nome de todos os registros da tabela
SELECT * FROM quiz WHERE id = 1; -- Selecione o registro com o id 1
SELECT id, name FROM quiz WHERE id = 1; -- Selecione o id e o nome do registro com o id 1
SELECT * FROM quiz WHERE teacher = 'Wandin'; -- Selecione todos os registros com o professor Wandin
SELECT * FROM quiz WHERE teacher = 'Wandin' AND year = 2022; -- Selecione todos os registros com o professor Wandin e o ano 2022

-- Selecione todos os registros com o professor Wandin ou Reinilton no ano de 2022
SELECT * FROM quiz WHERE (teacher = 'Wandin' OR teacher = 'Reinilton') AND year = 2022;

-- Atualizar o nome da prova de matemática para o registro com o id 1
UPDATE quiz SET name = 'Prova de Matemática' WHERE id = 1;

-- Atualizar o nome da prova de historia para o registro com o id 2
UPDATE quiz SET name = 'Prova de História' WHERE id = 2;

DELETE FROM quiz; -- Deletar todos os registros da tabela
DELETE FROM quiz WHERE id = 1; -- Remover um registro da tabela
DELETE FROM quiz WHERE id = 3 OR id = 4 OR id = 5; -- Remover todos os registros com o id 3, 4 ou 5
DELETE FROM quiz WHERE teacher = 'Gustavo'; -- Remover todos os registros com o professor Gustavo

-- CRUD - Create, Read, Update, Delete
-- Criar/Create     - INSERT INTO
-- Ler/Read         - SELECT x FROM
-- Atualizar/Update - UPDATE x SET y = z WHERE w = x
-- Remover/Delete   - DELETE FROM x WHERE y = z