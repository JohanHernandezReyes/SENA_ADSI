package jehr.calculadora;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int operacion;
        double num1, num2, resultado;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("==================================");
            System.out.println("|  Inicio del programa en Java  |");
            System.out.println("==================================");
            System.out.println("|                               |");
            System.out.println("|                               |");
            System.out.println("|        Hola! por favor        |");
            System.out.println("|       seleccione una de       |");
            System.out.println("|  las operaciones presentadas  |");
            System.out.println("|        a continuación:        |");
            System.out.println("|                               |");
            System.out.println("|                               |");
            System.out.println("==================================");
            System.out.println("|     Opc.     Nombre           |");
            System.out.println("| ----------------------------- |");
            System.out.println("|      1.      Suma             |");
            System.out.println("|      2.      Resta            |");
            System.out.println("|      3.      Multiplicación   |");
            System.out.println("|      4.      División         |");
            System.out.println("|      5.      Potencia         |");
            System.out.println("|                               |");
            System.out.println("==================================");

            operacion = input.nextInt();
        }while (operacion > 5);
        
        System.out.println("Ingrese el primer numero a operar: ");
        
        num1 = input.nextDouble();
        
        
        System.out.println("Ingrese el segundo numero a operar o exponente: ");
        
        num2 = input.nextDouble();
        
        
        if (operacion == 1) {
            resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resultado);
        } 
        
        else if (operacion == 2) {
            resultado = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + resultado);
        } 

        else if (operacion == 3) {
            resultado = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + resultado);
        }         
        
        else if (operacion == 4) {
            resultado = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + resultado);
        } 
        
        else if (operacion == 5) {
            resultado = Math.pow(num1, num2);
            System.out.println(num1 + " ^ " + num2 + " = " + resultado);
        } 
    }
    
}
