/*
Comentarios 
Multilinea
*/

-- Comentario de una sola linea

-- SQL Lenjuaje estructurado de consultas
-- DML Data Manipulations language
-- DDL Data definition language

/* Sentencias/ comandos/ Queries fundamentales */

-- Para mostrar las bases de datos existentes

SHOW DATABASES;

-- Para acceder a una base de datos en espesifico
USE ch43;

-- Mostrar las tablas que se encuentran en la base de datos

SHOW TABLES;

-- SELECT nos muestra la informacion solicitada necesita el uso de un FROM

SELECT * FROM productos;

SELECT * FROM clientes;

-- Consultas para traer columnas de una tabla
SELECT nombre, stock, precio 
FROM productos;

-- Consulta que cambia el nombre original por un alias (No de manera definitiva)
-- SELECT + AS (AS se refiere a un alias temporal)

SELECT nombre AS "name",
descripcion AS "Info"
FROM categoria;

-- WHERE nos ayuda a filtrar registros en una consulta

SELECT * FROM clientes
WHERE nombre = "Daniel Maldonado"; 

SELECT * FROM productos
WHERE nombre = "Teresa doll"; 

-- Seleccionar información de un cliente con un correo espesifico

SELECT nombre, direccion
FROM clientes
WHERE correo = "fer@gmail.com";

-- Seleccionar nombre, stock
SELECT nombre, stock
FROM productos
WHERE precio > 18.00;

-- Actualizar un dato en espesifico
UPDATE productos 
SET nombre = "Barbara"
WHERE id_productos = 1;

SELECT nombre FROM productos;

UPDATE productos 
SET precio = 120.99
WHERE id_productos = 4;

SELECT * FROM productos;

-- Eliminar algun registro
DELETE FROM productos
WHERE id_productos = 3;

-- ORDER BY ordena a partir de la columna seleccionada de manera ASC y DESC (Ascendente y Descendente)
SELECT * FROM clientes
ORDER BY  nombre DESC;

SELECT * FROM productos
ORDER BY precio DESC;

-- BETWEEN es un operador complementario de WHERE (Define un rango de valores)
SELECT * FROM clientes
WHERE id_clientes BETWEEN 2 AND 5;

-- IN operador complementario para WHERE 
SELECT * FROM productos
WHERE stock IN (50, 80);

-- INSERT INTO nos permite agregar nuevos registros a mi tabla
INSERT INTO clientes
(nombre, correo, direccion)
VALUES
("Liliana Aguirre","lili@gmail.com","calle poniente 6"),
("Miguel Castillo","miguel@gmail","calle poniente 7"),
("Daniela Luna","daniela@gmail","calle poniente 8"),
("Aparicio Huerta","aparicio@gmail","calle poniente 9"),
("Pablo Ramirez","pablo@gmail","calle poniente 10"),
("Sebastian Frias","Frias@gmail","calle poniente 11");

SELECT * FROM clientes;

-- Operador LIKE complementario para WHERE

SELECT * FROM clientes
WHERE nombre LIKE "%Luna%";

SELECT * FROM clientes 
WHERE nombre LIKE "%a";

SELECT * FROM clientes 
WHERE direccion LIKE "%poniente%";

-- OR se cumple una de las condiciones 
SELECT nombre, direccion 
FROM clientes 
WHERE nombre LIKE "%Mitzi%"
OR direccion LIKE "calle poniente 8%";

SELECT nombre, direccion 
FROM clientes 
WHERE nombre LIKE "%Aparicio%"
OR direccion LIKE "calle poniente 12%";

-- SELECT DISTINCT cuando existen registros duplicados solo me trae aquellos que no lo estan 
SELECT DISTINCT nombre FROM clientes;

/*
Funciones de agregación
*/

-- COUNT con esta función podemos saber cuantos valores tengo de una columna

SELECT COUNT(*) AS "Total de clientes" FROM clientes;

-- SUM suma todos los valores de una columna 
SELECT SUM(stock) AS "Total de productos" FROM productos;


-- AVG obtiene el promedio 
SELECT AVG(precio) AS "Total de costos" FROM productos;

-- MIN nos da el minimo 
SELECT MIN(precio) AS "Precio mas bajo" FROM productos;

-- MAX nos da el maximo
SELECT MAX(id_categoria) AS "Maximo" FROM categoria;


-- JOINS

-- INNER JOIN(JOIN) nos devuelve la coincidencia entre 2 tablas
SELECT
clientes.nombre AS "clientes",
pedidos.fecha,
productos.nombre AS "producto",
pedidos.total
FROM
pedidos
INNER JOIN clientes ON pedidos.clientes_id_clientes = clientes.id_clientes
INNER JOIN productos ON pedidos.detalles_pedido_id_detalles_pedido = productos.detalles_pedido_id_detalles_pedido;

-- RIGHT JOIN 
SELECT 
productos.nombre AS "producto",
categoria.nombre AS "categoria"
FROM 
productos
RIGHT JOIN categoria_productos ON productos.id_productos = categoria_productos.productos_id_productos
RIGHT JOIN categoria ON categoria_productos.categoria_id_categoria = categoria.id_categoria;

-- LEFT JOIN
SELECT 
clientes.nombre AS cliente,
pedidos.fecha,
pedidos.estado_pedido,
pedidos.total
FROM 
clientes
LEFT JOIN pedidos ON clientes.id_clientes = pedidos.clientes_id_clientes;