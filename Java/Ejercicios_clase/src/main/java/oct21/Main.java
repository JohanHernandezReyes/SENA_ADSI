package oct21;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        int ejercicio;
        double num1, num2, num3, num4, num5, resultado=0, num;
        DecimalFormat f = new DecimalFormat("####.##");
        
        do{
            ejercicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del ejericio a realizar:\n\n1.Prom de 5 nums\n2.Condicionales\n"
                                                                           + "3.Listar 20 items ingresados\n4.Listar 10 animales y sus  dueños\n5.Dividir 2 números\n"
                                                                           + "6.Restar 10 números\n7.Multiplicar por 10\n8.Obtener la raiz cuadrada de 3 nums\n9.Promedio de 15 números\n10.Simular login Facebook",
                                                                           "EJERCICIOS JAVA - MENU PRINCIPAL" ,-1));
        }while (ejercicio > 10);
        
        if(ejercicio==1)
        {
            num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
            num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
            num3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el tercer numero"));
            num4=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el cuarto numero"));
            num5=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el quinto numero"));
            
            resultado=(num1+num2+num3+num4+num5)/5;
            JOptionPane.showMessageDialog(null,"El promedio de los 5 numeros ingresados es: " + resultado, "RESULTADO",1);
        }
        
        else if(ejercicio==2)
        {
            JOptionPane.showMessageDialog(null,"Ya hiciste un ejericio usando condicionales.... elejiste una opcion en el menú principal XD", "HECHO!! :)",1);
        }
        
        else if(ejercicio==3)
        {
            String lista="1. ", item;
            
            for (int i=1; i<=20;i++)
            {
                item= JOptionPane.showInputDialog(null,"Ingrese un valor a lista\nDatos ingresados: " + (i-1), "INGRESE SUS DATOS", -1);
                if(i<20){lista+=item+"\n"+(i+1)+". ";}
                else {lista+=item;}
            }
            
            JOptionPane.showMessageDialog(null,"TU LISTA DE ITEMS:\n\n" + lista, "LISTA DE ITEMS", 1);
        }
        
        else if(ejercicio==4)
        {
            String lista="1. ", animal, dueño;
            
            for (int i=1; i<=3;i++)
            {
                animal= JOptionPane.showInputDialog(null,"Ingrese el nombre del animal N°" + i, "INGRESE SUS DATOS", -1);
                dueño= JOptionPane.showInputDialog(null,"Ingrese el nombre del dueño del animal N°" + i, "INGRESE SUS DATOS", -1);
                if(i<3){lista+="Animal: "+animal+" - Dueño: "+dueño+"\n"+(i+1)+". ";}
                else {lista+="Animal: "+animal+" - Dueño: "+dueño;}
            }
            
            JOptionPane.showMessageDialog(null,"TU LISTA DE ANIMALES:\n\n" + lista, "ANIMALES Y SUS DUEÑOS", 1);
        
        }
        
        else if(ejercicio==5)
        {    
            num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
            num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null,num1+" / "+num2+" = "+f.format(resultado), "RESULTADO",1);
        }
        
        else if(ejercicio==6)
        {
            resultado=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer número"));
            for (int i=1; i<=9;i++){
                num=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el número N°"+i+1));
                resultado-=num;
            }
            JOptionPane.showMessageDialog(null,"El resultado de restar los 10 números es: "+resultado, "RESULTADO",1);
        }
        
        else if(ejercicio==7)
        {    
            num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero"));
            resultado = num1 * 10;
            JOptionPane.showMessageDialog(null,num1+" X 10 "+" = "+resultado, "RESULTADO",1);
        }
        
        else if(ejercicio==8)
        {    
            num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
            num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
            num3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el tercer numero"));
            resultado = Math.sqrt(num1);
            num4 = Math.sqrt(num2);
            num5 = Math.sqrt(num3);
                    
            JOptionPane.showMessageDialog(null,"La raiz cuadrada de "+ num1 + " = " +f.format(resultado)
                                              + "\nLa raiz cuadrada de "+ num2 + " = " +f.format(num4)
                                              + "\nLa raiz cuadrada de "+ num3 + " = " +f.format(num5)  , "RESULTADO",1);
        }

        else if(ejercicio==9) {
            for (int i=1; i<=15;i++){
                num=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el número N°"+i));
                resultado+=num;
            }
            resultado/=15;
            JOptionPane.showMessageDialog(null,"El promedio de los 15 números ingresados es " + f.format(resultado) , "Promedio",1);
        }

        else if(ejercicio==10)
        {   
            String user;
            do{
                user = JOptionPane.showInputDialog(null,"Ingrese su email", "LOGIN", -1);
                if (user.matches(".*[@)].*[.com].*")==false){
                    JOptionPane.showMessageDialog(null,"El email no es válido", "Error", 0);
                };
            } while (user.matches(".*[@)].*[.com].*")==false);


            JOptionPane.showInputDialog(null,"Ingrese su password", "LOGIN", -1);
            JOptionPane.showMessageDialog(null,"Ha iniciado sesion en Facebook\nBienvenido " + user , "SIGN IN",1);
        }
    }
}
