using System;


namespace Taller2
{
    public class Resta:Operacion
    {
        int num3;

        public Resta(int Num1, int Num2):base(Num1, Num2)
        {
         
        }

        public int Restar()
        {
            num3 = num1 - num2;
            return num3;
        }
    }
}
