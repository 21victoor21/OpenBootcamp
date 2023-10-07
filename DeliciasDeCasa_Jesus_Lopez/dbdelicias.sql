CREATE DATABASE dbdelicias
USE dbdelicias
--USE master
--DROP DATABASE dbdelicias
CREATE TABLE Usuario(
IDusuario int not null primary key identity (1,1),
NomUsuaio varchar(50) not null,
ApePaterno varchar(30) not null,
ApeMaterno varchar(30)not null,
Celular int not null,
Correo varchar(100),
Clave varchar(500),
TipoUsuario varchar(13)
);

CREATE TABLE Pedido (
IDpedido int not null primary key identity (1,1),
IDusuario int,
FechaRegistro datetime,
FechaEntrega datetime,
DireccionPedido varchar(255)
);

CREATE TABLE DetallePedido(
IDpedido int,
IDproducto int,
Cantidad int,
DescripcionPedido varchar(255)
);

CREATE TABLE Producto(
IDproducto int not null primary key identity (1,1),
NomProducto varchar(100) not null,
PrecioUnit float
);

--Creamos la relacion 1:N mediante la restriccion CONSTRAINT/No puedo tener un pedido de un usuario que no existe.
ALTER TABLE Pedido add CONSTRAINT Fk_pedido_usuario FOREIGN KEY (IDusuario) REFERENCES Usuario (IDusuario)

--Creamos la relacion N:M en la tabla DetallePedido
ALTER TABLE DetallePedido ADD CONSTRAINT Fk_DetallePedido_Pedido FOREIGN KEY (IDpedido) REFERENCES Pedido(IDpedido)
ALTER TABLE DetallePedido ADD CONSTRAINT Fk_DetallePedido_Producto FOREIGN KEY (IDproducto) REFERENCES Producto(IDproducto)

--Eliminar dependencias para eliminar tablas
ALTER TABLE Pedido DROP CONSTRAINT Fk_pedido_usuario
ALTER TABLE DetallePedido DROP CONSTRAINT Fk_DetallePedido_Pedido
ALTER TABLE DetallePedido DROP CONSTRAINT Fk_DetallePedido_Producto
DROP TABLE DetallePedido

--Limpiar tabla con dependencia, funciona como el truncate
TRUNCATE TABLE Pedido
DBCC CHECKIDENT('Pedido',RESEED,0)

--DATOS
insert into Usuario values ('Jesus','Lopez','Escobar',955030881,'jesus.lopez@gmail.com','123','administrador')
insert into Usuario values ('Victor','Gonzales','Contreras',991925033,'21victoor21@gmail.com','456','empleado')
insert into Usuario values ('Betsy','Pujay','Moreno',986320344,'betsy_susana@hotmail.com','789','cliente')

insert into Pedido values (3,'09-04-23','10-04-23','Calle Roma 399 San Isidro')

insert into DetallePedido values (1,2,4,'2 de chocolate y 2 de arandano')

insert into Producto values ('Mini torta tematica',50)
insert into Producto values ('Muffins',20)
insert into Producto values ('Alfajores de maicena',15) 
insert into Producto values ('Ramo cervecero',36)
