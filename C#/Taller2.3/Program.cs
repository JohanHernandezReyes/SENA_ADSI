using System;

namespace Taller2._3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escriba 3 numeros separados por un espacio");
            string [] nums = Console.ReadLine().Split(' ');

            int Num1 = Int32.Parse(nums[0]); int Num2 = Int32.Parse(nums[1]); int Num3 = Int32.Parse(nums[2]);
            int suma = Num1 + Num2 + Num3;

            if (suma > 100)
            { Console.WriteLine("La suma de los 3 numeros es mayor a 100"); }
            else
            { Console.WriteLine("La suma de los 3 numeros es menor a 100"); }

            Console.WriteLine(Num1 + "+" + Num2 + "+" + Num3 + "=" + suma);

            Console.ReadLine();
        }
    }
}
