using System;

namespace Banco
{
    class Cliente
    {
        private string nombrecliente;
        private int codigocliente;
        private double saldocliente;

        public Cliente(string nombrecliente, int codigocliente, double saldocliente)
        {
            this.nombrecliente = nombrecliente;
            this.codigocliente = codigocliente;
            this.saldocliente = saldocliente;
        }
        public string getnombrecliente()
        {
            return nombrecliente;
        }

        public void setsaldocliente(double s)
        {
            saldocliente = s;
        }
        public double getsaldocliente()
        {
            return saldocliente;
        }

        public double deposito()
        {
            Console.WriteLine("ingrese el monto a depositar");
            double montodeposito = double.Parse(Console.ReadLine());
            return montodeposito;
        }
        public double retiro()
        {
            Console.WriteLine("ingrese el monto a extraer");
            double montoretiro = double.Parse(Console.ReadLine());
            return montoretiro;
        }
    }
}

