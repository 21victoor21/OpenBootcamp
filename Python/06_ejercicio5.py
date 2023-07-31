persona={"nombre":"juan","genero":"masculino","edad":"23","direccion":"ate","celular":"991925033"}
inf=input("Que informacion necesita saber:").lower()
print(persona.get(inf,"La propiedad NO EXISTE"))
