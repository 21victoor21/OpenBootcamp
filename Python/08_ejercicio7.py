print("This program calculates your body mass index")

peso=float(input("Ingrese su peso en Kg: "))
altura=float(input("Ingrese su altura en metros: "))

BMI=peso/(altura**2)
print("Su indice es: ", round(BMI,2))
      
if(BMI<=18.5):
    print("Underweight")
elif(BMI>18.5 and BMI<=24.9):
    print("Normal weigth")
elif(BMI>24.9 and BMI<=29.9):
    print("Overweight")
else:
    print("Obesity")
