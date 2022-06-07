using System;

namespace Clases_Abstractas
{
    class DVD:Producto
    {
        public DVD(double precioP, double costoP, string nombreP) : base(precioP, costoP, nombreP) { }

        public override string imprimirdatos()
        {
            return "DVD: " + nombre + ", Precio con IVA: $" + this.IVA(19);
        }

    }
}
