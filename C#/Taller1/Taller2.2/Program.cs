using System;

namespace Taller2._2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" Escriba un numero entero: ");
            double Numero = Double.Parse(Console.ReadLine());

            if (Numero % 2 == 0)
            {
                Console.WriteLine("El numero es par");
                Console.WriteLine("El doble del numero es:" + Numero * 2);
            }

            else
            {
                Console.WriteLine("El numero es impar");
                Console.WriteLine("La mitad del numero es:" + Numero / 2);
            }

            Console.ReadLine();

        }
    }
}
