import math
radius=float(input("Ingresa el radio del circulo"))
print("EL radio del circulo es: ", radius)
area=(radius**2)*math.pi
circunferencia=2*(math.pi)*radius
print("El area del circulo es: ",round(area,2)," y la circunferencia es: ",round(circunferencia,2))
