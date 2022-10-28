using System;

namespace Banco
{
    class Banco
    {
        public void crearclientes()
	  {	
		Console.WriteLine("Escriba el nombre del cliente número 1");	
		string nombrecliente1 = Console.ReadLine();	
	  	public Cliente cliente1 = new Cliente(nombrecliente1, 1, 0.0);

		Console.WriteLine("Escriba el nombre del cliente número 2");	
		string nombrecliente2 = Console.ReadLine();        	
		public Cliente cliente2 = new Cliente(nombrecliente2, 2, 0.0);
        	
		Console.WriteLine("Escriba el nombre del cliente número 3");	
		string nombrecliente3 = Console.ReadLine();        	
		public Cliente cliente3 = new Cliente(nombrecliente3, 3, 0.0);
        }

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
