not1=float(input("Ingres la primera nota:"))
not2=float(input("Ingrese segunda nota:"))
ausencias= int(input("ingrese nunmero de ausencias"))
total_clases=int(input("Ingrese el total de numero de clases:"))

avg_grade=(not1+not2)/2
asistencia=(total_clases-ausencias)/total_clases

print("Nota Promedio:", round(avg_grade,2))
print("Asistencia rate:", str(round((asistencia*100),2))+'%')

if(avg_grade>=6 and asistencia>=0.8):
        print("The studen has been approved")
elif(avg_grade < 6 and asistencia<0.8):
    print("The student has failed due to an average grade lower than 6.0 and an attendance rate lower than 80%")
elif(asistencia>=0.8):
    print("The student has failed due to an average grade lower than6.0")
else:
    print("The student has failed due to an attendance rate lower than 80%")
    
    
    
