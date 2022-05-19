using System;

namespace Taller2._1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" Por favor ingrese un numero");
            double Num1 = Double.Parse(Console.ReadLine());

            Console.WriteLine(" Por favor ingrese un segundo numero");
            double Num2 = Double.Parse(Console.ReadLine());

            if (Num1 > Num2)
            { Console.WriteLine(Num1 + " Es mayor a " + Num2); }

            else if (Num1 == Num2)
            { Console.WriteLine(Num1 + " Es igual a " + Num2); }

            else
            { Console.WriteLine(Num1 + " Es menor a " + Num2); }

            Console.ReadLine();

        }
    }
}
