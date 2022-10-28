package fruteria;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class fruteria {
    
    public static void main(String[] args) {
        
        double kg, dcto=0, subtotal, neto;
        DecimalFormat f = new DecimalFormat("$#,###,###.##");
        
        kg= Double.parseDouble(JOptionPane.showInputDialog(null, "Cúantos kgs de manzanas va a comprar?", "Venta de manzanas", -1));
        subtotal = 4200 * kg;
                
        if (kg <= 2)
        {
            dcto=0;
        }
        
        else if (kg <= 5)
        {
            dcto=subtotal * 0.1;
        }
        
        else if (kg <= 10)
        {
            dcto=subtotal * 0.15;
        }
        
        else if (kg > 10)
        {
            dcto=subtotal * 0.2;
        }
        
        neto = subtotal - dcto;
        JOptionPane.showMessageDialog(null, "La compra de  " + kg + "kgs. tiene un valor de "+ f.format(subtotal) + ".\nUd. tiene un descuento por valor de " + f.format(dcto)
                                       + ",\npor lo tanto el valor neto a pagar es: " + f.format(neto), "Valor de su compra", 1);
        
    }
}
