using System;

namespace Banco
{
    class Banco
    {
        public Cliente cliente1 = new Cliente("Camilo", 1, 0.0);
        public Cliente cliente2 = new Cliente("Johan", 2, 0.0);
        public Cliente cliente3 = new Cliente("Wilmmer", 3, 0.0);

        public double[] transacion(int codigo, int trans)
        { 
            if (codigo == 1)
            {
                if (trans == 1)
                {
                    cliente1.setsaldocliente(cliente1.getsaldocliente() + cliente1.deposito());
                }
                else if (trans == 2)
                {
                    cliente1.setsaldocliente(cliente1.getsaldocliente() - cliente1.retiro());
                }
            }
                
            else if (codigo == 2)
            {
               if (trans == 1)
               {
                    cliente2.setsaldocliente(cliente2.getsaldocliente() + cliente2.deposito());
               }
               else if (trans == 2)
               {
                    cliente2.setsaldocliente(cliente2.getsaldocliente() - cliente2.retiro());
               }
            }
                
            else if (codigo == 3)
            {
               if (trans == 1)
               {
                    cliente3.setsaldocliente(cliente3.getsaldocliente() + cliente3.deposito());
               }
               else if (trans == 2)
               {
                    cliente3.setsaldocliente(cliente3.getsaldocliente() - cliente3.retiro());
                }
            }

            double[] saldos = new double[] { cliente1.getsaldocliente(), cliente2.getsaldocliente(), cliente3.getsaldocliente() };
            return saldos;

        }
    }

}
