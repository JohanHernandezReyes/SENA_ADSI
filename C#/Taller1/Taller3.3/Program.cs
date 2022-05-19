using System;

namespace Taller3._3
{
    class Program
    {
        static void Main(string[] args)
        {
            double suma = 0;

            for (int i=1; i<=20;i++)
            {
                Console.WriteLine("Ingrese la nota del aprendiz " + i);
                double nota=Double.Parse(Console.ReadLine());
                suma += nota;
            }

            Console.WriteLine("el promedio de las notas es: " + suma / 20);
            Console.ReadLine();

        }
    }
}
