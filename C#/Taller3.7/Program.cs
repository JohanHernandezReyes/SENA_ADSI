using System;


namespace Taller3._7
{
    class Program
    {
        static void Main(string[] args)
        {
          int suma = 0, num = 1;
       
          for(int i=0; num!=0; i++) {
                
                Console.WriteLine("Escriba un numero para sumar o indique cero para terminar:");
                num = int.Parse(Console.ReadLine());
                suma += num;
           
          }

            Console.WriteLine("\nLa suma de los numeros ingresados es:" + suma + "\nFIN!!!!");
            Console.ReadLine();
        }
            
    }
}
   
        
        





        
    

