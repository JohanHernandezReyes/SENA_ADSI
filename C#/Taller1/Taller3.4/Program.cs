using System;

namespace Taller3._4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("ingrese los numeros que desea sumar:");

            int num, total, suma=0;

            while (suma <=100)
            { int valor = int.Parse(Console.ReadLine());
                suma = suma + valor;

            }
            Console.WriteLine("la suma total es: " + suma);
            Console.ReadLine();

   


        }
    }
}
