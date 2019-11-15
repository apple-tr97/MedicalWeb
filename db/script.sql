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
	id_ss Char(20),
	poliza Int NOT NULL,
	mail Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
 Primary Key (id_paciente)) ENGINE = MyISAM;

Create table Medico (
	id_doctor Int NOT NULL AUTO_INCREMENT,
	nombre Varchar(30) NOT NULL,
	apellido Varchar(30) NOT NULL,
	cedula Int NOT NULL,
	equipo Varchar(20) NOT NULL,
	universidad Varchar(20) NOT NULL,
	afiliacion Varchar(20) NOT NULL,
	especialidad Varchar(20) NOT NULL,
	mail Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
	UNIQUE (cedula),
 Primary Key (id_doctor)) ENGINE = MyISAM;

Create table Historial_Medico (
	id_historial Int NOT NULL AUTO_INCREMENT,
	id_paciente Int NOT NULL,
	padecimiento Varchar(30),
	diagnostico Varchar(30),
	tratamiento Varchar(30),
	analisis_rechazados Varchar(30),
	resultados Varchar(30),
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
	apellido Varchar(30) NOT NULL AUTO_INCREMENT,
	mail Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
 Primary Key (id_administrador)) ENGINE = MyISAM;

Create table Consulta (
	id_consulta Int NOT NULL,
	id_doctor Int NOT NULL,
	id_paciente Int NOT NULL,
	id_receta Int NOT NULL,
 Primary Key (id_consulta,id_doctor,id_paciente,id_receta)) ENGINE = MyISAM;

Create table Usuario (
	id_usuario Int NOT NULL AUTO_INCREMENT,
	nombre Varchar(30) NOT NULL,
	apellido Char(30) NOT NULL,
	tipo Int NOT NULL,
	correo Varchar(30) NOT NULL,
	password Varchar(30) NOT NULL,
 Primary Key (id_usuario)) ENGINE = MyISAM;


Alter table Historial_Medico add Foreign Key (id_paciente) references Paciente (id_paciente) on delete  restrict on update  restrict;
Alter table Consulta add Foreign Key (id_paciente) references Paciente (id_paciente) on delete  restrict on update  restrict;
Alter table Consulta add Foreign Key (id_doctor) references Medico (id_doctor) on delete  restrict on update  restrict;
Alter table Consulta add Foreign Key (id_receta) references Receta (id_receta) on delete  restrict on update  restrict;


/* Users permissions */


