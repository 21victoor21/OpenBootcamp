first_name=input("Ingresa tu nombre")
second_name=input("Ingresa tu segundo nombre")
last_name=input("Ingresa tu apellido")
producto="037-00901-00027"
print("Your initials are ", first_name[:1]+ second_name[:1]+ last_name[:1])
print("Country code: ",producto[0:3])
print("Product code: ",producto[4:9])
print("Batch numbre: ",producto[-5:])

