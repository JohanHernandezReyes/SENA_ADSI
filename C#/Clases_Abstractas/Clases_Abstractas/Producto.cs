using System;

namespace Clases_Abstractas
{
    abstract class Producto
    {
        protected double precio, costo;
        protected string nombre;

        public Producto(double precioP, double costoP, string nombreP)
        {
            precio = precioP;
            costo = costoP;
            nombre = nombreP;
        }

        public abstract string imprimirdatos();

        public double IVA (double tarifa)
        {
            return precio * (1 + (tarifa/100));
        }
    }
}
