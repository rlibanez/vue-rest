-- Crear la tabla AUTOR
CREATE TABLE AUTOR (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    anno_nacimiento INTEGER
);

-- Crear la tabla LIBRO
CREATE TABLE LIBRO (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    isbn VARCHAR(255),
    anno_publicacion INTEGER,
    autor_id BIGINT,
    FOREIGN KEY (autor_id) REFERENCES AUTOR(id)
);

-- Insertar datos de ejemplo en la tabla AUTOR
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Gabriel', 'García Márquez', 1927);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Isabel', 'Allende', 1942);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Jorge', 'Luis Borges', 1899);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Mario', 'Vargas Llosa', 1936);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Julio', 'Cortázar', 1914);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Carlos', 'Fuentes', 1928);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Octavio', 'Paz', 1914);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Laura', 'Esquivel', 1950);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Juan', 'Rulfo', 1917);
INSERT INTO AUTOR (nombre, apellidos, anno_nacimiento) VALUES ('Roberto', 'Bolaño', 1953);


-- Insertar datos de ejemplo en la tabla LIBRO
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Cien Años de Soledad', '978-3-16-148410-0', 1967, 1);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('La Casa de los Espíritus', '978-0-06-088328-7', 1982, 2);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Ficciones', '978-0-14-118384-8', 1944, 3);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('La Ciudad y los Perros', '978-0-374-52738-5', 1963, 4);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Rayuela', '978-0-394-70015-8', 1963, 5);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('El Otoño del Patriarca', '978-0-06-088328-8', 1975, 1);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Crónica de una Muerte Anunciada', '978-0-06-088328-9', 1981, 1);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Eva Luna', '978-0-06-088329-0', 1987, 2);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Paula', '978-0-06-088329-1', 1994, 2);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('El Aleph', '978-0-06-088329-2', 1949, 3);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('El Informe de Brodie', '978-0-06-088329-3', 1970, 3);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Conversación en la Catedral', '978-0-06-088329-4', 1969, 4);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('La Fiesta del Chivo', '978-0-06-088329-5', 2000, 4);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Bestiario', '978-0-06-088329-6', 1951, 5);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Final del Juego', '978-0-06-088329-7', 1956, 5);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('La Muerte de Artemio Cruz', '978-0-06-088329-8', 1962, 6);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Aura', '978-0-06-088329-9', 1962, 6);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('El Laberinto de la Soledad', '978-0-06-088330-0', 1950, 7);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Piedra de Sol', '978-0-06-088330-1', 1957, 7);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Como Agua para Chocolate', '978-0-06-088330-2', 1989, 8);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('La Ley del Amor', '978-0-06-088330-3', 1995, 8);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Pedro Páramo', '978-0-06-088330-4', 1955, 9);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('El Llano en Llamas', '978-0-06-088330-5', 1953, 9);

INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('Los Detectives Salvajes', '978-0-06-088330-6', 1998, 10);
INSERT INTO LIBRO (titulo, isbn, anno_publicacion, autor_id) VALUES ('2666', '978-0-06-088330-7', 2004, 10);