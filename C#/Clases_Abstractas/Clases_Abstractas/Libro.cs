using System;

namespace Clases_Abstractas
{
    class Libro:Producto
    {
        public Libro (double precioP, double costoP, string nombreP) :base (precioP, costoP, nombreP) { }

        public override string imprimirdatos()
        {
            return "Libro: " + nombre + ", Precio: $" + precio + ", Costo: $" + costo;
        }
    }
}
