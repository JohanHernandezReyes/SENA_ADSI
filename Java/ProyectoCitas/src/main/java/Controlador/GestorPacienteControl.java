
package Controlador;

import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;


public abstract class GestorPacienteControl implements ActionListener{
    
    //Modelo.GestorPaciente pacientesModelo;
    //SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
    PacientesJpaController pacientesModelo;
    Vista.ConsPacientesIF consultarPacienteVista;
   
        
    public GestorPacienteControl(Vista.ConsPacientesIF consultarPacienteVista){
        this.consultarPacienteVista=consultarPacienteVista;
        //pacientesModelo=new Modelo.GestorPaciente();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
        pacientesModelo=new PacientesJpaController(emf);
    }
    
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String valor=consultarPacienteVista.txt_valor.getText();
        int parametro=0;
        if(consultarPacienteVista.rdb_identificacion.isSelected()){
            parametro=1;
        }
        if(consultarPacienteVista.rdb_nombres.isSelected()){
            parametro=2;
        }
        if(consultarPacienteVista.rdb_apellidos.isSelected()){
            parametro=3;
        }
        if(consultarPacienteVista.rdb_sexo.isSelected()){
            parametro=4;
            
            
            
        }
        //LinkedList<Modelo.Paciente> pacientes=pacientesModelo.getPacientebyParametro(parametro, valor);
        List<Modelo.Pacientes> pacientes=pacientesModelo.findPacientesEntities();
        String registro[]=new String[5];
        String []Titulos = {"Identificacion","Nombre","Apellidos","Fecha Nacimiento","Genero"};
        tmodelo=new DefaultTableModel();
        tmodelo.setColumnIdentifiers(Titulos);
        /*for(Modelo.Paciente p:pacientes){
            registro[0]=p.getIdentificacion();
            registro[1]=p.getNombres();
            registro[2]=p.getApellidos();
            registro[3]=datef.format(p.getFechanacimiento());
            registro[4]=p.getSexo();
            tmodelo.addRow(registro);
        }*/
        
        for(Modelo.Pacientes p:pacientes){
            registro[0]=p.getPacidentificacion();
            registro[1]=p.getPacnombres();
            registro[2]=p.getPacapellidos();
            registro[3]=p.getPacfechanacimiento().toString();
            registro[4]=p.getPacsexo().toString();
            tmodelo.addRow(registro);
        }
        
        consultarPacienteVista.tbl_datos.setModel(tmodelo);
    }
}
