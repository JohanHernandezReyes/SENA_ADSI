package banco;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Banco {
    
    public static void main(String[] args) {
        
        double VA, VF;
        DecimalFormat f = new DecimalFormat("$#,###,###.##");
        
        VA= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor a depositar", "Deposito", -1));
        VF= VA * Math.pow(1 + 0.02, 60);
        
        JOptionPane.showMessageDialog(null, "Valor Consignado: " +  f.format(VA) + "\nValor futuro en 5 años: " + f.format(VF), "Simulación inversión", 1);
        
    }
}
