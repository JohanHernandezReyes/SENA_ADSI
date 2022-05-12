using System;

namespace Taller1._2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escriba su nombre");
            string Nombre = Console.ReadLine();

            Console.WriteLine("Escriba la cantidad de meses laborados");
            double Meses = Double.Parse(Console.ReadLine());

            double Porcentaje_meses = (Meses / 12) * 100;
            Console.WriteLine(Nombre + " trabajó un " + Math.Round(Porcentaje_meses,2) + "% de los meses del año");
            Console.ReadLine();

        }
    }
}
