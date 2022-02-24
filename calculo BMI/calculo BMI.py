#calculo BMI

print("Ingrese su peso en kg:") 
W=float(input()) 

print("Ingrese su altura en mts:") 
H=float(input())
BMI=W/H**2

print(f'su indice de masa corporal es {round(BMI, 2)}')

resultado=""
if BMI<=16.9:
   resultado="Se encuentra en delgadez severa"
elif BMI<=18.4:
   resultado="Se encuentra bajo de peso"
elif BMI<=24.9:
   resultado="Tu peso es adecuado"  
elif BMI<=29.9:
   resultado="Se encuentra en sobrepeso"
else:
   resultado="Presenta obesidad" 

print(resultado)   