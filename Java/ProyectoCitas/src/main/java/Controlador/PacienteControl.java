
package Controlador;

import java.awt.event.*;
import java.util.Date;
//import java.text.*;

public abstract class PacienteControl implements ActionListener{
    
    Vista.RegPacienteIF pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente gestorpacienteModelo;
    
    public PacienteControl(Vista.RegPacienteIF pacienteVista){
        this.pacienteVista = pacienteVista;
        gestorpacienteModelo = new Modelo.GestorPaciente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(pacienteVista.RegistrarBtn)){
            String id = pacienteVista.txt_identificacion.getText();
            String nombre = pacienteVista.txt_nombres.getText();
            String apellido = pacienteVista.txt_apellidos.getText();
            String sexo = " ";
            //SimpleDateFormat f = new SimpleDateFormat("dd/MM/yy");
            Date Fechanac = pacienteVista.Dtd_fechanac.getDate();
        
            if(pacienteVista.rdb_masculino.isSelected()){
                sexo="M";
            }
            
            if(pacienteVista.rdb_femenino.isSelected()){
                sexo="F";
            }
            pacienteModelo=new Modelo.Paciente(id,nombre,apellido,sexo,Fechanac);
            gestorpacienteModelo.RegistrarPacientes(pacienteModelo);
        }
        
        if(e.getSource().equals(pacienteVista.NewButton)){
            pacienteVista.txt_identificacion.setText("");
            pacienteVista.txt_nombres.setText("");
            pacienteVista.txt_apellidos.setText("");
            pacienteVista.Dtd_fechanac.setDate(null);
            pacienteVista.rdb_masculino.setSelected(true);
            pacienteVista.rdb_femenino.setSelected(false);
            pacienteVista.txt_identificacion.requestFocus();
        }

    }
    
}
