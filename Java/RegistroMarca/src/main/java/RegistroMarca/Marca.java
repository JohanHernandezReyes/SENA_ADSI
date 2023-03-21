
package RegistroMarca;

import java.util.Date;

public class Marca {
    private int idMarca;
    private String NombreMarca;
    private String Productos;
    private Date FechaRegistro;
    private double Valor;

    public Marca(int idMarca, String NombreMarca, String Productos, Date FechaRegistro, double Valor) {
        this.idMarca = idMarca;
        this.NombreMarca = NombreMarca;
        this.Productos = Productos;
        this.FechaRegistro = FechaRegistro;
        this.Valor = Valor;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public String getNombreMarca() {
        return NombreMarca;
    }

    public String getProductos() {
        return Productos;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public double getValor() {
        return Valor;
    }
    
   
}
