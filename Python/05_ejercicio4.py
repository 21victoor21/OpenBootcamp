nac=input("Ingrese su cumpleaños con este formato DD-MM-YYYY")
print("La fecha ingresada es: ",nac)
mes=("enero","febrero","marzo","abril","mayo","junio","julio","agosto","setiembre","octubre","noviembre","diciembre")
val=int(nac[3:5])-1
cumple= mes[val]
print("usted nacio en: ",cumple)

per=["juan","pedro","raul","emilio"]
nom=input("ingresa tu nombre: ")
per.append(nom)
print("Esta es la nueva lista:",per)
