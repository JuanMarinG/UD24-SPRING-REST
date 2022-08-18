DROP TABLE IF EXISTS Empleado;

CREATE TABLE Empleado(
Id int auto_increment primary key,
Nombre varchar (100),
Empleo enum('Arquitecto','Programador','Diseñador','Ingeniero'),
Salario double
);

INSERT INTO Empleado (Nombre, Empleo, Salario) VALUES ('Carlos','Programador',1.400);
INSERT INTO Empleado (Nombre, Empleo, Salario) VALUES ('Maria','Arquitecto',2.500);
INSERT INTO Empleado (Nombre, Empleo, Salario) VALUES ('Juan','Diseñador',1.300);
INSERT INTO Empleado (Nombre, Empleo, Salario) VALUES ('Jose','Programador',1.400);
INSERT INTO Empleado (Nombre, Empleo, Salario) VALUES ('Jaume','Diseñador',1.300);
INSERT INTO Empleado (Nombre, Empleo, Salario) VALUES ('Nuria','Ingeniero',3.000);

SELECT * FROM Empleado;