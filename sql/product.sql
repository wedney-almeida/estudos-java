-- Banco de estudos
CREATE DATABASE IF NOT EXISTS estudos;
USE estudos;

-- Cria a tabela de produtos (apaga a anterior, se existir, para o script poder rodar de novo)
DROP TABLE IF EXISTS product;

CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    category VARCHAR(100),
    price DECIMAL(10, 2)
);

-- Insere os 6 produtos da questão 4 da mini-prova
INSERT INTO product (name, category, price)
VALUES ('Notebook', 'Electronics', 3500.00),
       ('Mouse', 'Electronics', 80.00),
       ('Java Book', 'Books', 120.00),
       ('Novel', 'Books', 45.00),
       ('Headphones', 'Electronics', 250.00),
       ('Pen', 'Stationery', 3.50);

-- Consulta A: produtos com preço acima de 100, em ordem alfabética
SELECT name, price
FROM product
WHERE price > 100
ORDER BY name ASC;

-- Consulta B: quantidade de produtos por categoria
SELECT category, COUNT(*)
FROM product
GROUP BY category;