
package PeluqueriaCanina.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idduenio;
    
    private String nombre, celular, direccion;

    public Duenio(int idduenio, String nombre, String celular, String direccion) {
        this.idduenio = idduenio;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }

    public Duenio() {
    }

    public int getIdduenio() {
        return idduenio;
    }

    public void setIdduenio(int idduenio) {
        this.idduenio = idduenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
