CREATE PROCEDURE sp_RegistrarUsuario
@nomusu varchar(50),
@appatusu varchar(30),
@apematusu varchar(30),
@celular int,
@correo varchar (100),
@clave varchar (500)
AS
BEGIN
DECLARE @existe int 
SELECT @existe = count (IDusuario) FROM Usuario WHERE Celular = @celular
IF(@existe<1)
BEGIN
INSERT INTO Usuario VALUES (@nomusu, @appatusu, @apematusu, @celular, @correo, @clave, 'cliente')
PRINT 'USUARIO REGISTRADO' 
END
ELSE
BEGIN
PRINT 'EL USUARIO EXISTE'
END
END
GO

EXEC sp_RegistrarUsuario 'Juan', 'Ambrosio', 'Berrocal', 922151985, 'Juan.Ambrosio@gmail.com', 'Juan2023'
select* from Usuario
