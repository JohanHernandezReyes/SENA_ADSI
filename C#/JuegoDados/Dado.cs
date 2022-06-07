using System;
using System.Threading;

namespace JuegoDados
{
    class Dado
    {
        public int numdado;

        public Dado(int n)
        {
            numdado = n;
        }

        public int lanzar()
        {
            Console.WriteLine("Lanzando el dado numero " + numdado + "...");
            Thread.Sleep(1);
            Random R = new Random();
            
            return R.Next(1, 7);
        }
    }
}
