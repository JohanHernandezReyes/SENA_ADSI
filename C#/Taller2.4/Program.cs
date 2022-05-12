using System;

namespace Taller2._4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escriba un numero:");
            double numero = Double.Parse(Console.ReadLine());
            
            if (numero>10)
            { Console.WriteLine(numero + " elevado al cuadrado es igual a " + Math.Pow(numero, 2)); }
            else
            { Console.WriteLine("el residuo de dividir " + numero + " entre 3 es: " + numero % 3); }

            Console.ReadLine();
        }
    }
}
