
package Modelo;

import java.util.Date;
import java.util.LinkedList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class GestorPaciente {

    public static LinkedList<Paciente> pacientes;
    private static Connection conn;
    SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
    
    public GestorPaciente(){
        //pacientes=new LinkedList<Paciente>();
        
        Recursos.Conexion conexion=new Recursos.
        Conexion("localhost","proyecto_citas","root","12345");
        conn=conexion.getConexion();
    }
    
    public void RegistrarPacientes(Paciente P){
        //pacientes.add(P);
        
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement("insert into PACIENTE values(?,?,?,?,?)");
            pst.setString(1,P.getIdentificacion());
            pst.setString(2,P.getNombres());
            pst.setString(3,P.getApellidos());
            pst.setString(4,datef.format(P.getFechanacimiento()));
            pst.setString(5,P.getSexo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Paciente Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static LinkedList<Paciente> getPacientebyParametro(int param, String valor){
        
        LinkedList<Paciente> resultado = new LinkedList<>();
        String sql="";
        
        //for(Paciente P:pacientes){
            switch(param){
                case 1:
                    //if(P.getIdentificacion().contains(valor)); resultado.add(P);
                    sql="select * from pacientes where PACIDENTIFICACION='"+valor+"'";
                    break;
                
                case 2:
                    //if(P.getNombres().contains(valor)); resultado.add(P);
                    sql="select * from pacientes where PACNOMBRES='"+valor+"'";
                    break;
            
                case 3:
                    //if(P.getApellidos().contains(valor)); resultado.add(P);
                    sql="select * from pacientes where PACAPELLIDOS='"+valor+"'";
                    break;
                    
                case 4:
                    //if(P.getSexo().contains(valor)); resultado.add(P);
                    sql="select * from pacientes where PACSEXO='"+valor+"'";
                    break;
                
            }           
        //}
        
        try{
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                resultado.add(new Paciente(rs.getString("PACIDENTIFICACION"),
                rs.getString("PACNOMBRES"),rs.getString("PACAPELLIDOS"),
                rs.getString("PACSEXO"), rs.getDate("PACFECHANACIMIENTO")));
            }
            st.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return resultado;
    }
}
