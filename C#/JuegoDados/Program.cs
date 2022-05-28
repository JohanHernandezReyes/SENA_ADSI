using System;

namespace JuegoDados
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("BIENVENIDO AL JUEGO DE DADOS\n");

            Dado d1 = new Dado(1); int Valord1 = d1.lanzar();
            Console.WriteLine("Dado 1: " + Valord1+ "\n");

            Dado d2 = new Dado(2); int Valord2 = d2.lanzar();
            Console.WriteLine("Dado 2: " + Valord2 + "\n");

            Dado d3 = new Dado(3); int Valord3 = d3.lanzar();
            Console.WriteLine("Dado 3: " + Valord3 + "\n");

            if (Valord1 == Valord2 & Valord1 == Valord3)
            
            {Console.WriteLine("\nLos 3 dados son iguales. Felicidades ganaste el juego!!! :)");}

            else if(Valord1 == Valord2 || Valord1 == Valord3 || Valord2 == Valord3)
            { Console.WriteLine("\nLos valores de 2 dados son iguales. Casi lo logras, sigue intentando!"); }


            else
            { Console.WriteLine("\nLos valores de los 3 dados son diferentes. Perdiste! :(");}

            Console.ReadLine();
        }
    }
}
