using System;

namespace Taller2
{
    public class Multiplicacion:Operacion
    {
        int num3;

        public Multiplicacion(int Num1, int Num2):base(Num1, Num2)
        {
         
        }

        public int Multiplicar()
        {
            num3 = num1 * num2;
            return num3;
        }

    }
}
