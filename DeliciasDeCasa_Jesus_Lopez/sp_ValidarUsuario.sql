CREATE PROCEDURE SP_ValidarUsuario
@email varchar(100),
@clave varchar(500),
@mensaje varchar (50) output
AS
BEGIN
DECLARE @existe int
SELECT @existe = COUNT(Correo) FROM Usuario WHERE Correo = @email and Clave = @clave
IF(@existe>=1)
set @mensaje = 'BIENVENIDO'
ELSE
set @mensaje = 'EL USUARIO NO EXISTE, POR FAVOR REGISTRAR SU USUARIO'
END
GO
DECLARE @mensaje varchar(50)
EXEC SP_ValidarUsuario '21victoor21@gmail.com',456, @mensaje output
select @mensaje
