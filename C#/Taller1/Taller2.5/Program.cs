using System;

namespace Taller2._5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el nombre del estudiante a evaluar:");
            string Alumno = Console.ReadLine();

            Console.WriteLine("Ingrese las 3 calificaciones obtenidas por el estudiante separadas por un espacio (Notas de 1 a 100):");
            string [] Notas = Console.ReadLine().Split(' ');
            double Nota1 = Double.Parse(Notas[0]); double Nota2 = Double.Parse(Notas[1]); double Nota3 = Double.Parse(Notas[2]);

            double prom = (Nota1 + Nota2 + Nota3) / 3;

            if (prom>=70)
            { Console.WriteLine(Alumno + " obtuvo un promedio de "+ Math.Round(prom,2) + ". Aprobó el curso"); }
            else
            { Console.WriteLine(Alumno + " obtuvo un promedio de "+ Math.Round(prom,2) + ". Reprobó el curso"); }

            Console.ReadLine();
        }
    }
}
