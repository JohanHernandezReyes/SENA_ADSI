using System;

namespace Clases_Abstractas
{
    class Program
    {
        static void Main(string[] args)
        {
            //Ejercicio 1
            Pig cerdo1 = new Pig("mi cerdo");
            cerdo1.animalsound();
            cerdo1.sleep();

            //Ejercicio 2
            Libro lb = new Libro(1000.50, 800.45, "Don Quijote");
            Console.WriteLine("\n"+lb.imprimirdatos());

            DVD d1 = new DVD(100, 60, "Saga Matrix");
            Console.WriteLine(d1.imprimirdatos());



            Console.ReadLine();

        }
    }
}
