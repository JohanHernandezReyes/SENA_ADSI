using System;

namespace Taller2
{
    public class Operacion
    {
        public int num1, num2;

        public Operacion(int Num1, int Num2)
        {
            num1=Num1;
            num2=Num2;
        }


        public int Operaciones(string opcion)
        {
            int resultado=0;

            if (opcion=="SUMA")
            {
                Suma s = new Suma(num1, num2);
                resultado= s.Sumar();

            }

            else if (opcion == "RESTA")
            {
                Resta r = new Resta(num1, num2);
                resultado = r.Restar();
            }

            else if (opcion == "MULTIPLICACION")
            {
                Multiplicacion m = new Multiplicacion(num1, num2);
                resultado = m.Multiplicar();
            }

            return resultado;
        }
    }
}