using System;

namespace Taller3._2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el numero de personas:");
            int personas = Int32.Parse(Console.ReadLine());

            int i = 1; double hombres = 0; double mujeres = 0;
            while (i<=personas)
            {
                Console.WriteLine("Ingrese el genero de la persona "+ i +"(M/F):");
                string genero = Console.ReadLine().ToUpper();
                
                if (genero=="M")
                { hombres += 1; }
                else if(genero=="F")
                { mujeres += 1; }
                
                i += 1;
            }

            double porc_hombres = hombres / personas*100;
            double porc_mujeres = mujeres / personas*100;

            Console.WriteLine("El porcentaje de hombres es " + porc_hombres + "%");
            Console.WriteLine("El porcentaje de mujeres es " + porc_mujeres + "%");

            Console.ReadLine();
        }
    }
}
