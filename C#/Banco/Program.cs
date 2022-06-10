using System;

namespace Banco
{
    class Program
    {
        static void Main(string[] args)
        {
            Banco Mibanco = new Banco();
            double[] valores;
            int trans;

		Console.WriteLine("BIENVENIDO A SU BANCO");
		Mibanco.crearclientes();

            Console.WriteLine("ingrese el codigo del cliente o 0 para salir");
            int codigo = int.Parse(Console.ReadLine());
            while (codigo > 3)
            {
                Console.WriteLine("Digite un codigo de cliente correcto");
                codigo = int.Parse(Console.ReadLine());
            }

            

            while (codigo > 0)
            {
                Console.WriteLine("Elija [1] para depositar o [2] para retirar");
                trans = int.Parse(Console.ReadLine());
                while (trans < 1 || trans > 2)
                {
                    Console.WriteLine("Ingrese un valor correcto.Elija [1] para depositar o [2] para retirar");
                    trans = int.Parse(Console.ReadLine());
                }

                valores = Mibanco.transacion(codigo, trans);

                Console.WriteLine("El saldo del cliente " + Mibanco.cliente1.getnombrecliente() + " es: $" + valores[0]);
                Console.WriteLine("El saldo del cliente " + Mibanco.cliente2.getnombrecliente() + " es: $" + valores[1]);
                Console.WriteLine("El saldo del cliente " + Mibanco.cliente3.getnombrecliente() + " es: $" + valores[2]);
                Console.WriteLine("El saldo total del banco es: $" + (valores[0] + valores[1] + valores[2]));

                Console.WriteLine("\ningrese el codigo del cliente o 0 para salir");
                codigo = int.Parse(Console.ReadLine());
                while (codigo > 3)
                {
                    Console.WriteLine("Digite un codigo de cliente correcto");
                    codigo = int.Parse(Console.ReadLine());
                }
            }

            Console.WriteLine("Ha elegido salir del programa. Presione enter para finalizar!");
            Console.ReadLine();
        }
    }
}
