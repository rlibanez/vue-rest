CREATE TABLE PERSONA (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    anno_nacimiento INTEGER
);

INSERT INTO PERSONA (nombre, apellidos, anno_nacimiento) VALUES ('Juan', 'Pérez', 1980);
INSERT INTO PERSONA (nombre, apellidos, anno_nacimiento) VALUES ('María', 'González', 1990);
INSERT INTO PERSONA (nombre, apellidos, anno_nacimiento) VALUES ('Carlos', 'Rodríguez', 1975);