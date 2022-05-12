using System;

namespace Taller1._1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el numero de horas laboradas");
            int horas = Int32.Parse(Console.ReadLine());

            Console.WriteLine("Ingrese el valor de hora");
            int Valor_hora = Int32.Parse(Console.ReadLine());

            int Total_a_pagar = horas * Valor_hora;
            Console.WriteLine("Total a pagar:" + Total_a_pagar);

            int minutos = horas * 60;
            Console.WriteLine("Cantidad de minutos trabajados:" + minutos);
            Console.ReadLine();

        }
    }
}
