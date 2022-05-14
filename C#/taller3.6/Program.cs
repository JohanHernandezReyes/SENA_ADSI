using System;

namespace taller__3_6
{
    class Program
    {
        static void Main(string[] args)
        {
            double num=1;
            while (num != 0)
            {
                Console.WriteLine("Escriba un numero para continuar o indique cero para terminar:");
                num = Double.Parse(Console.ReadLine());
            }

            Console.ReadLine();
        }
    }
}
