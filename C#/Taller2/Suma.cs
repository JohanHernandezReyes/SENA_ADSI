using System;

namespace Taller2
{
    public class Suma:Operacion
    {
        int num3;
       
        public Suma(int Num1, int Num2):base(Num1, Num2)
        {
         
        }

        public int Sumar()
        {
            num3 = num1 + num2;
            return num3;
        }
    }
}
