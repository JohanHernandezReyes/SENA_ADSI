using System;

namespace Taller1._3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escriba los pesos a convertir");
            double Pesos = Double.Parse(Console.ReadLine());

            Console.WriteLine("Escriba cuanto vale 1 dolar a hoy");
            double Tasa_de_cambio = Double.Parse(Console.ReadLine());

            double Dolares = Pesos / Tasa_de_cambio;
            Console.WriteLine("$" + Pesos + " son :" + Math.Round(Dolares, 2) + " Dolares ");
            Console.ReadLine();


        }
    }
}
