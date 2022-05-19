using System;
using static Taller2.Suma;
using static Taller2.Resta;
using static Taller2.Multiplicacion;

namespace Taller2
{
    public class Operacion
    {
        public int Operaciones(string opcion, int num1, int num2)
        {
            int resultado=0;

            if (opcion=="suma")
            {
                Suma s = new Suma();
                resultado= s.Sumar(num1, num2);

            }

            else if (opcion == "resta")
            {
                Resta r = new Resta();
                resultado = r.Restar(num1, num2);
            }

            else if (opcion == "multiplicacion")
            {
                Multiplicacion m = new Multiplicacion();
                resultado = m.Multiplicar(num1, num2);
            }

            return resultado;
        }
    }
}