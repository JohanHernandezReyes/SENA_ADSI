
package funcion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class funcionalgebra {
    

    public static void main(String[] args) {
        
        int a=0, c=0, e=0, y;
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> d = new ArrayList<Integer>();
        
        for (int x=1; x<=10;x++)
        {
            y = (int)(Math.pow(x, 2) - (2 * x));
            a+=y;          
             
            if (y%3==0)
            {b.add(y);c+=y;}
             
            char [] digitos = String.valueOf(y).toCharArray();
            if (digitos[digitos.length-1] == '5')
            {d.add(y);e+=y;} 
        }
        
        JOptionPane.showMessageDialog(null, "a. La suma de los valores de Y es: " + a + "\nb. Valores de Y multiplos de 3 son: " + String.valueOf(b) + "\nc. La suma de los valores de Y multiplos de 3 es: " + c 
                                            + "\nd. Los valores de Y cuyo ultimo digito es 5 son: " + String.valueOf(d) + "\ne. La suma de los valores con ultimo digito 5 es : " + e,
                                            "Resultados de la Función", 1);
        
    }
}
