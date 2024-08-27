create database estacionamiento;
use estacionamiento;
create table cliente (
	celular int(12),
    mail varchar(50),
    primary key (celular)
);

create table lugar(
	ID int(12) AUTO_INCREMENT,
    cliente int(12),
    primary key (ID),
    foreign key (cliente) references cliente(celular)
);

create table facturar(
	egreso datetime,
    ingreso datetime,
    ID int(12) AUTO_INCREMENT,
    lugar int(12),
    cliente int(12),
    primary key(ID),
    foreign key(lugar) references lugar(ID),
    foreign key(cliente) references cliente(celular)
);

alter table cliente add 
lugar int(12);

alter table cliente ADD 
FOREIGN KEY(lugar) REFERENCES lugar(ID);


