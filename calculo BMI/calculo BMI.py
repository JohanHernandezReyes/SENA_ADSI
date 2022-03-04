#calculo BMI

print("Ingrese su peso en kg:") 
W=float(input()) 

print("Ingrese su altura en mts:") 
H=float(input())
BMI=W/H**2

print(f'su indice de masa corporal es {round(BMI, 2)}')

resultado=""
if BMI<=16.99:
   resultado="Se encuentra en delgadez severa"
elif BMI<=18.49:
   resultado="Se encuentra bajo de peso"
elif BMI<=24.99:
   resultado="Su peso es el adecuado"  
elif BMI<=29.99:
   resultado="Se encuentra en sobrepeso"
elif BMI<=34.99:
   resultado="Presenta obesidad" 
else:
   resultado="Es clinicamente obeso" 

print(resultado)   