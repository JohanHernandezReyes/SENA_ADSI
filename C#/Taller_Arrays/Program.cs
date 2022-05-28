using System;

namespace Taller_Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            int opcion=0;

            while(opcion<1 || opcion>3)
            {
                Console.WriteLine("EJERCICIOS CON ARREGLOS\n\n"+
                              "Elija el ejercicio a realizar:\n"+
                              "1.Promedio de notas\n"+
                              "2.Ingresar datos de clientes\n"+
                              "3.Suma de productos\n");

                opcion = Int32.Parse(Console.ReadLine());
            }
            
             if (opcion==1)
             { string [] nombres = {"Juan", "Pedro", "Maria", "Pablo"};
               Console.WriteLine("Elija uno de los estudiantes del curso:");
               foreach (string i in nombres)
               {
                    int index = Array.IndexOf(nombres, i)+1;
                    Console.WriteLine(index+". "+i);
               }

               int estudiante = Int32.Parse(Console.ReadLine())-1;
               string nombre=nombres[estudiante];
               
               Console.WriteLine("Digite las 3 notas de "+nombre+" separadas por un espacio:");
                
               string [] calif = Console.ReadLine().Split(' '); 
               double [] notas={Double.Parse(calif[0]), Double.Parse(calif[1]), Double.Parse(calif[2])};
               double suma=0;
               foreach (double n in notas)
               { suma+=n;}

               Console.WriteLine("El promedio de "+nombre+" fue: " + (suma/notas.Length));
               
               if((suma/notas.Length)>=7)
               {Console.WriteLine("APROBADO");}
               else{Console.WriteLine("NO APROBADO");}
                
             }

             if (opcion==2)
             { 
                Console.WriteLine("Ingrese los datos de los clientes");
                
                string[]nombres=new string[5];
                string[]apellidos=new string[5];
                int[]edad=new int[5];
                char[]sexo=new char[5];

                for (int i=0;i<=4;i++)
                { 
                    Console.WriteLine("Cliente N° "+ (i+1));
                    Console.WriteLine("Nombre:"); nombres[i]=Console.ReadLine();
                    Console.WriteLine("Apellido:"); apellidos[i]=Console.ReadLine();
                    Console.WriteLine("Sexo:"); sexo[i]=Char.Parse(Console.ReadLine());
                    Console.WriteLine("Edad:"); edad[i]=int.Parse(Console.ReadLine());
                    Console.WriteLine("\n");
                }    
                 
               Console.WriteLine("BD DE CLIENTES\n");
               for (int i=0;i<=4;i++)
               { 
                    Console.WriteLine("Cliente N° "+ (i+1));
                    Console.WriteLine("Nombre: " + nombres[i]);
                    Console.WriteLine("Apellido: " + apellidos[i]);
                    Console.WriteLine("Sexo: " + sexo[i]);
                    Console.WriteLine("Edad: " + edad[i]+"\n");
               }    
                        
             }

             
             if (opcion==3)
             {
                Console.WriteLine("Cuántos productos van a ser sumados?");
                int cantidad = int.Parse(Console.ReadLine());
                int contador=0;
                double [] precios = new double [cantidad];
                
                while(contador<cantidad)
                {
                    Console.WriteLine("Ingrese el precio del producto N° "+(contador+1));
                    precios[contador] = Double.Parse(Console.ReadLine());
                    contador+=1;
                }    
                
                double suma=0;
                foreach(double p in precios)
                { suma+=p;}

                Console.WriteLine("\nLa suma de los precios de los " + cantidad + " productos ingresados es: $"+ suma);
                       
             }

            Console.ReadLine();
        }
    }
}
