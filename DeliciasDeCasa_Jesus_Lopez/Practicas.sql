--Registrar Usuario.
CREATE PROCEDURE SP_RegistrarUsuario
@Nom varchar(50),
@ApPat varchar(30),
@ApMat varchar(30),
@cel int,
@correo varchar(100),
@Clave varchar(500)
AS
BEGIN
DECLARE @exis int
SELECT @exis = COUNT (Celular) FROM Usuario WHERE Celular = @cel
IF (@exis<1)
INSERT INTO Usuario VALUES (@Nom, @ApPat, @ApMat, @cel, @correo, @Clave,'cliente')
ELSE
PRINT 'YA EXISTE USUARIO REGISTRADO CON ESE CELULAR'
END
GO
EXEC SP_RegistrarUsuario 'Juan', 'Ambrosio', 'Berrocal', 922151985, 'Juan.ambrosio@hotmail.com', 'Juan123'



--realizar pedido
--validar que el producto y usuario exista si no existe mostrar mensaje el producto no existe
SELECT *
FROM Usuario
SELECT *
FROM Pedido
SELECT *
FROM DetallePedido
SELECT *
FROM Producto

ALTER VIEW A
AS
SELECT IDproducto, NomProducto,PrecioUnit
FROM Producto
GO
SELECT * FROM A

CREATE VIEW B
AS
SELECT NomUsuaio,ApePaterno,ApeMaterno,TipoUsuario
FROM Usuario
WHERE TipoUsuario = 'cliente'
GO

SELECT *
FROM B

CREATE VIEW C
AS
SELECT x.NomUsuaio, y.FechaRegistro
FROM Usuario AS x INNER JOIN Pedido as y
ON x.IDusuario = y.IDusuario
WHERE x.TipoUsuario = 'cliente'
GO

select * from Usuario
select *
from c

CREATE VIEW D
AS
SELECT count (IDusuario) as 'cantidad de usuario', TipoUsuario
FROM Usuario
GROUP BY Usuario.TipoUsuario
GO

select * from D

SELECT * FROM Pedido
SELECT DATEDIFF(day,FechaRegistro,FechaEntrega) AS 'tiempo de peiddo'
FROM Pedido
where IDpedido = 1

DROP VIEW A
DROP VIEW B
DROP VIEW C
DROP VIEW D