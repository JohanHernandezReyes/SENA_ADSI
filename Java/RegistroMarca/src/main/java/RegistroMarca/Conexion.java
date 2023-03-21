package RegistroMarca;

import java.sql.*;
import javax.swing.*;

public class Conexion {
    
    Connection conectar = null;
    
    public Connection Conectar(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/marcas", "root", "12345");
        System.out.println("Conexión exitosa");
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println("Conexión Fallida. " + e);
    }   
    
    return conectar;
    }
}
