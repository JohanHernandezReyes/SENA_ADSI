using System;

namespace Taller3._1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escriba el numero limite:");
            int n = int.Parse(Console.ReadLine());

            Console.WriteLine("Los numeros pares entre 1 y " + n + " son:");
            for (int i = 2;i<=n;i+=2)
            { Console.WriteLine(i); }

            Console.ReadLine();
        }
    }
}
