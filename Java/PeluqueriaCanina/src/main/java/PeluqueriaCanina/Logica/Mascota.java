
package PeluqueriaCanina.Logica;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    
    private String nombre_perro, raza, color, observaciones;
    private boolean alergico, atencion_especial;
    
    @ManyToOne
    private Duenio idduenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre_perro, String raza, String color, String observaciones, boolean alergico, boolean atencion_especial, Duenio idDuenio) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.observaciones = observaciones;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.idduenio = idDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public Duenio getIdduenio() {
        return idduenio;
    }

    public void setIdduenio(Duenio idduenio) {
        this.idduenio = idduenio;
    }
    
    
    
}
