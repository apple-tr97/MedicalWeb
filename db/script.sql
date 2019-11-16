/*
Created		15/11/2019
Modified		15/11/2019
Project		
Model		
Company		
Author		
Version		
Database		mySQL 5 
*/


drop table IF EXISTS Usuario;
drop table IF EXISTS Consulta;
drop table IF EXISTS Administrador;
drop table IF EXISTS Receta;
drop table IF EXISTS Historial_Medico;
drop table IF EXISTS Medico;
drop table IF EXISTS Paciente;


Create table Paciente (
	id_paciente Int NOT NULL AUTO_INCREMENT,
	nombre Varchar(30) NOT NULL,
	apellido Varchar(30) NOT NULL,
	id_ss Varchar(30),
	poliza Varchar(30) NOT NULL,
	mail Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
	UNIQUE (mail),
	UNIQUE (poliza),
	UNIQUE (id_ss),
 Primary Key (id_paciente)) ENGINE = MyISAM;

Create table Medico (
	id_doctor Int NOT NULL AUTO_INCREMENT,
	nombre Varchar(30) NOT NULL,
	apellido Varchar(30) NOT NULL,
	cedula Varchar(30) NOT NULL,
	equipo Varchar(20) NOT NULL,
	universidad Varchar(20) NOT NULL,
	afiliacion Varchar(20) NOT NULL,
	especialidad Varchar(20) NOT NULL,
	mail Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
	UNIQUE (cedula),
	UNIQUE (mail),
 Primary Key (id_doctor)) ENGINE = MyISAM;

Create table Historial_Medico (
	id_historial Int NOT NULL AUTO_INCREMENT,
	id_paciente Int NOT NULL,
	padecimiento Varchar(30),
	diagnostico Varchar(30),
	tratamiento Varchar(30),
	analisis_rechazados Varchar(30),
	resultados Varchar(30),
	UNIQUE (id_paciente),
 Primary Key (id_historial,id_paciente)) ENGINE = MyISAM;

Create table Receta (
	id_receta Int NOT NULL AUTO_INCREMENT,
	ultimo_tratamiento Varchar(30) NOT NULL,
	medicamento Varchar(30) NOT NULL,
	qr_doctor Varchar(30) NOT NULL,
 Primary Key (id_receta)) ENGINE = MyISAM;

Create table Administrador (
	id_administrador Int NOT NULL AUTO_INCREMENT,
	nombre Varchar(30) NOT NULL,
	apellido Varchar(30) NOT NULL,
	mail Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
	UNIQUE (mail),
 Primary Key (id_administrador)) ENGINE = MyISAM;

Create table Consulta (
	id_doctor Int NOT NULL,
	id_receta Int NOT NULL,
	id_paciente Int NOT NULL,
 Primary Key (id_doctor,id_receta,id_paciente)) ENGINE = MyISAM;

Create table Usuario (
	id Int NOT NULL AUTO_INCREMENT,
	email Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
	tipo Varchar(30) NOT NULL,
 Primary Key (id)) ENGINE = MyISAM;


Alter table Historial_Medico add Foreign Key (id_paciente) references Paciente (id_paciente) on delete  restrict on update  restrict;
Alter table Consulta add Foreign Key (id_paciente) references Paciente (id_paciente) on delete  restrict on update  restrict;
Alter table Consulta add Foreign Key (id_doctor) references Medico (id_doctor) on delete  restrict on update  restrict;
Alter table Consulta add Foreign Key (id_receta) references Receta (id_receta) on delete  restrict on update  restrict;


INSERT INTO Medico VALUES(1, "Estefania", "Suarez Martinez", "00001", "equipo_uno","ITESM","IMSS","Cardiologia","estefania@gmail.com","hola_estefania");
INSERT INTO Medico VALUES(2, "Jesus", "Cruz Cruz", "00002","equipo_dos","UNAM","ISSTE","Oftalmologo","jesus@gmail.com","hola_jesus");
INSERT INTO Medico VALUES(3, "Santiago", "Cuarenta Fabela", "00003","equipo_uno","UDEM","IMSS","Gastroenterologo","santiago@gmail.com","hola_santiago");
INSERT INTO Medico VALUES(4, "Alicia", "Muñoz Aguilar", "00004","equipo_dos","ITESM","IMMS","Internista","alicia@gmail.com","hola_alicia");
INSERT INTO Medico VALUES(5, "Leticia", "Uribe Mondragon", "00005","equipo_dos","UNAM","ISSTE","Anestesiologo","leticia@gmail.com","hola_leticia");


INSERT INTO Paciente VALUES(1, "Juan", "Perez Martinez", "11111", "22222","juan@gmail.com","hola_juan");
INSERT INTO Paciente VALUES(2, "Fernanda", "Lopez Gonzalez", "22222","33333","fernanda@gmail.com","hola_fernanda");
INSERT INTO Paciente VALUES(3, "Pedro", "Rojas Casas", "33333","44444","pedro@gmail.com","hola_pedro");
INSERT INTO Paciente VALUES(4, "Alejandra", "Orduño Peña", "44444","55555","alejandra@gmail.com","hola_alejandra");
INSERT INTO Paciente VALUES(5, "Lilia", "Cervantes Martinez", "55555","66666","lilia@gmail.com","hola_lilia");
INSERT INTO Paciente VALUES(6, "Adrian", "Gutierrez Vera", "66666","77777","adrian@gmail.com","hola_adrian");
INSERT INTO Paciente VALUES(7, "Emanuel", "Perez del Rio", "77777","88888","emanuel@gmail.com","hola_emanuel");
INSERT INTO Paciente VALUES(8, "Maria", "Pallares Mendoza", "88888","99999","maria@gmail.com","hola_maria");

INSERT INTO Administrador VALUES(1,"Octavio","Gutierrez","tavo@gmail.com","hola_tavo");

INSERT INTO Usuario VALUES(1, "luz@gmail.com", "hola_luz", "Administrador");
INSERT INTO Usuario VALUES(2, "alex@gmail.com", "hola_alex", "Paciente");
INSERT INTO Usuario VALUES(3, "gus@gmail.com", "hola_gus", "Medico");
INSERT INTO Usuario VALUES(4, "luz@gmail.com", "hola_luz", "Administrador");

/* Users permissions */


