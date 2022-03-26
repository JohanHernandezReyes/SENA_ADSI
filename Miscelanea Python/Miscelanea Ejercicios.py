#Miscelanea de ejercicios Python

#1.Bienvenida

print("Bienvenido a la Miscelanea de Ejercicios para practicar Python!!!")

#2.Variables
MenuPpal={1:"Operadores", 2:"Condicionales", 3:"Ciclos", 99:"Salir"}

MsgError="Ingrese una opción correcta"

Operadores={1:"Area del triangulo",
            2:"Suma de 2 números",
            3:"Potenciacion al cuadrado",
            4:"Conversor EUR-USD",
            5:"Area y perimetro del cuadrado",
            6:"Volumen del cilindro",
            7:"Area del circulo",
            8:"Promedio de 3 numeros",
            9:"Menú Principal"}

Condicionales={ 1:"Positivo o Negativo",
                2:"Cual es el mayor de 2 numeros?",
                3:"Cual es el mayor de 3 numeros?",
                4:"Condicional suma o resta",
                5:"Cociente de 2 numeros",
                6:"Condicional suma o multiplicacion",
                7:"El año es bisiesto?",
                8:"Menú Principal"}

Ciclos={1:"Multiplos de 3 menores a 100",
        2:"Numeros impares de 0 a 100",
        3:"Numeros pares de 0 a 100",
        4:"Elevar al cuadrado del 1 al 30",
        5:"Suma de los cuadrados del 0 al 99",
        6:"Secuencia entre 2 enteros",
        7:"Suma de input diferente a cero",
        8:"Menú Principal"}

#3. Funciones
def MenuPrincipal():
    return int(input(f"\nIngrese un numero de acuerdo al tema que desea trabajar:{MenuPpal}\n"))

def MenuOperadores():
    return int(input(f"\nIngrese el numero del ejercicio a realizar:{Operadores}\n")) 

def MenuCondicionales():
    return int(input(f"\nIngrese el numero del ejercicio a realizar:{Condicionales}\n"))
    
def MenuCiclos():
    return int(input(f"\nIngrese el numero del ejercicio a realizar:{Ciclos}\n"))     

Tema=MenuPrincipal()

def miscelanea(Tema):  
    if Tema==1:
        Ejercicio=MenuOperadores()
        while Ejercicio!=9:
            print("\n", str(Operadores[Ejercicio].upper()))
            if Ejercicio==1:
                base, altura = input("Ingrese la base y la altura del triangulo separadas por un espacio:").split()
                print("El area del triangulo es:", round((float(base)*float(altura))/2,2), "cm2")
            elif Ejercicio==2:
                num1, num2 = input("Ingrese 2 numeros separados por un espacio:").split()
                print("la suma de los numeros ingresados es:", float(num1)+float(num2))
            elif Ejercicio==3:
                num1 = float(input("Ingrese el numero que desea elevar al cuadrado:"))
                print(num1,"^2=", num1**2)
            elif Ejercicio==4:
                eur=float(input("Ingrese el valor en euros a convertir:"))
                tasa=float(input("Ingrese la tasa de cambio del dia:"))
                print(eur,"EUR = USD",round(eur*tasa,2),)
            elif Ejercicio==5:
                lado=float(input("Cuantos cm mide cada lado del cuadrado?:"))
                print("El area del cuadrado es:", lado**2, "cm2, y el perimetro es:", lado*4, "cm", sep="")
            elif Ejercicio==6:
                radio=float(input("Cuantos cm tiene el radio de la base del cilindro?:"))
                altura=float(input("Cual es la altura en cm del cilindro?:"))
                print("El volumen del cilindro es:", round(3.1416*(radio**2)*altura,2), "cm3", sep="")
            elif Ejercicio==7:
                radio=float(input("Cuantos cm tiene el radio del circulo?:"))
                print("El area del circulo es:", round(3.1416*(radio**2),2), "cm2", sep="")
            elif Ejercicio==8:
                num1, num2, num3 = input("Ingrese 3 numeros separados por un espacio:").split()
                num1, num2, num3 = float(num1), float(num2), float(num3)
                print("El promedio de los numeros ingresados es:", round((num1+num2+num3)/3,2))
            else: 
                print(MsgError)
            
            Ejercicio=MenuOperadores() 
        else: 
            print("Regresando al Menú Principal...")
    

    elif Tema==2:
        Ejercicio=MenuCondicionales()
        while Ejercicio!=8:
            print("\n", str(Condicionales[Ejercicio]).upper())      
            if Ejercicio==1:
                num = float(input("Ingrese un numero:"))
                if num<0:
                    print(num, "es un numero negativo")
                else:
                    print(num, "es un numero positivo")
            elif Ejercicio==2:
                num1, num2 = input("Ingrese 2 numeros diferentes separados por un espacio:").split()
                if float(num1)>float(num2):
                    print(num1, "es mayor que", num2)
                else:
                    print(num2, "es mayor que", num1)
            elif Ejercicio==3:
                num1, num2, num3 = input("Ingrese 3 numeros diferentes separados por un espacio:").split()
                
                mayor=num1
                if float(num2)>float(num1):
                    mayor=num2
                elif float(num3)>float(num1):
                    mayor=num3
                print(mayor, "es el numero mayor de los 3 ingresados")
                
                menor=num1
                if float(num2)<float(num1):
                    menor=num2
                elif float(num3)<float(num1):
                    menor=num3
                print(menor, "es el numero menor de los 3 ingresados")

            elif Ejercicio==4:
                A, B = input("Ingrese 2 numeros diferentes separados por un espacio:").split()
                if float(A)>float(B):
                    print(A, "-", B, "=", float(A) - float(B))
                else:
                    print(A, "+", B, "=", float(A) + float(B))
            elif Ejercicio==5:
                A, B = input("Ingrese 2 numeros diferentes separados por un espacio:").split()
                if float(B)==0:
                    print("La división entre cero no está permitida")
                else:
                    cociente=round(float(A)/float(B),2)
                    print(A, "/", B, "=", cociente)
            elif Ejercicio==6:
                A, B = input("Ingrese 2 numeros diferentes separados por un espacio:").split()
                if float(A)<0 or float(B)<0:
                    print(A, "+", B, "=", float(A) + float(B))
                else:
                    print(A, "X", B, "=", float(A) * float(B))
            elif Ejercicio==7:
                year = int(input("Ingrese un año:\n"))
                if year%100==0:
                    if year%400==0:
                        print(f'El año {year} es bisiesto')
                    else:
                        print(f'El año {year} no es bisiesto')
                else:
                    if year%4==0:
                        print(f'El año {year} es bisiesto')
                    else:
                        print(f'El año {year} no es bisiesto')
            else:
                print(MsgError)
            
            Ejercicio=MenuCondicionales()
        else: 
            print("Regresando al Menú Principal...")

    elif Tema==3:
        Ejercicio=MenuCiclos()
        while Ejercicio!=8:
            print("\n", str(Ciclos[Ejercicio]).upper())    
            if Ejercicio==1:
                for i in range(1,100):
                    if i%3==0:
                        print(i, end=" ")
                print("\n")        
            elif Ejercicio==2:
                for i in range(101):
                    if i%2!=0:
                        print(i, end=" ")
                print("\n")
            elif Ejercicio==3:
                for i in range(101):
                    if i%2==0:
                        print(i, end=" ")
                print("\n")
            elif Ejercicio==4:
                for i in range(1, 31):
                    print(f'{i}^2={i**2}')
            elif Ejercicio==5:
                suma=0
                for i in range(100):
                    suma+=i**2
                print("La suma de los cuadrados de los primeros 100 numeros naturales es:", suma)
            elif Ejercicio==6:
                A, B = input("Ingrese 2 numeros enteros (A y B) separados por un espacio, donde B sea mayor que A:").split()
                while int(A)>=int(B):
                    print("B debe ser mayor que A. Ingrese los datos nuevamente:")
                    A, B = input("Ingrese 2 numeros (A y B) separados por un espacio, donde B sea mayor que A:").split()
                for i in range(int(A)+1,int(B)):
                    print(i, end=" ")
                print("\n")
            elif Ejercicio==7:
                num = float(input("Digite un numero diferente de cero:"))
                suma=0
                while num!=0:
                    suma+=num
                    num = float(input("Digite un numero diferternte de cero:"))
                print("La suma de los numeros ingresados es:", suma)
            else:
                print(MsgError)
            
            Ejercicio=MenuCiclos()
        else:
            print("Regresando al Menú Principal...")
    
    else: salir(Tema)

def salir(Tema):
    if Tema==99:
        print("Ha elegido salir del programa")
        confirm=input("Esta seguro? S/N\n")
        while confirm.upper() !="S":
            if confirm.upper()=="N":
                print("Regresando al Menú Principal...")
                Tema=MenuPrincipal()   
                miscelanea(Tema)
            else:
                print(MsgError)
                confirm=input("Esta seguro? S/N\n")
        else:
            print("Gracias por usar nuestro programa")
            quit()
    else: 
        print("Ha elegido un valor incorrecto, el programa se cerrará")
        quit()


#4.Programa Principal
while 0<Tema<4:
    miscelanea(Tema)
    Tema=MenuPrincipal()
else:
    salir(Tema)
   
