using System;
using static Taller2.Operacion;

namespace Taller2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escriba el primer numero");
            int num1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Escriba el segundo numero");
            int num2 = int.Parse(Console.ReadLine());

            Console.WriteLine("Indique la operacion a realizar (suma, resta o multiplicacion");
            string opcion = Console.ReadLine().ToUpper();

            Operacion O = new Operacion(num1, num2);

            Console.WriteLine("\nEl resultado de la " + opcion + " es: " + O.Operaciones(opcion));
            Console.ReadLine();
        }
    }
}
