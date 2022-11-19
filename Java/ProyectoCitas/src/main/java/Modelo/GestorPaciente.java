
package Modelo;

import java.util.*;

public class GestorPaciente {

    public static LinkedList<Paciente> pacientes;
    
    public GestorPaciente(){
        pacientes = new LinkedList<>();
    }
    
    public void RegistrarPacientes(Paciente P){
        pacientes.add(P);
    }
    
    public static LinkedList<Paciente> getPacientebyParametro(int param, String valor){
        
        LinkedList<Paciente> resultado = new LinkedList<>();
        for(Paciente P:pacientes)
        {
            switch(param){
                case 1:if(P.getIdentificacion().contains(valor))
                       resultado.add(P);
                    break;
                
                case 2:if(P.getNombres().contains(valor))
                       resultado.add(P);
                    break;
            
                case 3:if(P.getApellidos().contains(valor))
                       resultado.add(P);
                    break;
                    
                case 4:if(P.getSexo().contains(valor))
                       resultado.add(P);
                    break;
                
            }           
        }
        return resultado;
    }
    
    
    public static LinkedList<Paciente> getPacientebyFechaNac(Date FechaNac){
        
        LinkedList<Paciente> resultado = new LinkedList<>();
        for(Paciente P:pacientes)
        {
            if(P.getFechanacimiento().equals(FechaNac))
               resultado.add(P);
        }
        
        return resultado;
    }
    
}
