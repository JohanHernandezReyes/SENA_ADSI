using System;

namespace TallerMetodos
{
    class Program
    {
        static void Main(string[] args)
        {
            int opcion=0;

            while(opcion<1 || opcion>4)
            {
                Console.WriteLine("METODOS\n\n"+
                              "Elija el método a ejecutar:\n"+
                              "1.Conversión tipos de cambio\n"+
                              "2.Área del rectángulo\n"+
                              "3.Verificar edades\n"+
                              "4.Tablas de multiplicar\n");

                opcion = Int32.Parse(Console.ReadLine());
            }
            
             if (opcion==1)
             { 
                static void conversion(double trm, double valor, string moneda)
                {                    
                    Console.WriteLine(valor + " " + moneda + " equivalen a: $" + (trm*valor));
                }    

                 Console.WriteLine("Escriba el nombre de la moneda a convertir a pesos: ");string moneda=Console.ReadLine();
                 Console.WriteLine("Escriba la tasa de cambio del día: ");double trm=Double.Parse(Console.ReadLine());
                 Console.WriteLine("Escriba el valor en "+moneda+" que desea convertir a pesos: ");double valor=Double.Parse(Console.ReadLine());
                 
                 conversion(trm, valor, moneda);
            
             }

             if (opcion==2)
             { 
                static double area (double Base, double Altura)
                {
                    return Base*Altura;
                }
           
                Console.WriteLine("Cuál es la base del rectangulo en cm?: ");double Base=Double.Parse(Console.ReadLine());
                Console.WriteLine("Cuál es la altura del rectangulo en cm?: ");double Altura=Double.Parse(Console.ReadLine());
                        
                Console.WriteLine("El área del rectangulo es: " + area(Base, Altura) + "cm2");
             }

             
             if (opcion==3)
             {
                static void verifedad (int edad)
                {
                    while (edad<=0)
                    { 
                      Console.WriteLine("\nError, ingrese una edad mayor a cero");
                      Console.WriteLine("Ingrese la edad de la persona ");
                      edad=int.Parse(Console.ReadLine());
                    }
                    
                    if (edad<18)
                    { Console.WriteLine("\nLa personas es menor de edad");}
                    else if (edad<60)
                    { Console.WriteLine("\nLa persona es mayor de edad");}
                    else 
                    {Console.WriteLine("\nEs una persona de la tercera edad");}
                }
                
                Console.WriteLine("Ingrese la edad de la persona ");
                int edad=int.Parse(Console.ReadLine());
                verifedad(edad);

             }

             if (opcion==4)
             {
                static void multiplicar (int numero)
                {
                    Console.WriteLine("Multiplos de "+numero+" hasta el 12:");
                    for (int i =1;i<=12;i++)
                    {
                        Console.WriteLine(numero+"X"+i+"="+(numero*i));
                    }
                }    

                Console.WriteLine("Ingrese un numero entero para ver sus multiplos");int numero=int.Parse(Console.ReadLine());

                multiplicar(numero);

                       
             }

            Console.ReadLine();
        }
    }
}
