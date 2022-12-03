
package Recursos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private String driver,url, ip, bd, usr,pass;
    public Connection conexion;
    
    public Conexion(String ip, String bd, String usr,String pass){
        driver="com.mysql.cj.jdbc.driver";
        this.bd="proyecto_citas";
        this.usr="root";
        this.pass="12345";
        url="jdbc:mysql://localhost:3306/" + bd;
        
        try{
            Class.forName(driver).newInstance();
            conexion=DriverManager.getConnection(url,usr,pass);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error de conexion a la base de datos");
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public Connection CerrarConexion() throws SQLException{
        conexion.close();
        conexion=null;
        return conexion;
    }
}
