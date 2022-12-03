
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "pacientes")
@NamedQueries({
@NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p")})
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PACIDENTIFICACION")
    private String pacidentificacion;
    @Basic(optional = false)
    @Column(name = "PACNOMBRES")
    private String pacnombres;
    @Basic(optional = false)
    @Column(name = "PACAPELLIDOS")
    private String pacapellidos;
    @Basic(optional = false)
    @Column(name = "PACSEXO")
    private Character pacsexo;
    @Basic(optional = false)
    @Column(name = "PACFECHANACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date pacfechanacimiento;

    //Constructor sin parametros
    public Pacientes() {
    
    }
    
    //Constructor con parametros
    public Pacientes(String pacidentificacion, String pacnombres, String pacapellidos, Character pacsexo, Date pacfechanacimiento) {
        this.pacidentificacion = pacidentificacion;
        this.pacnombres = pacnombres;
        this.pacapellidos = pacapellidos;
        this.pacsexo = pacsexo;
        this.pacfechanacimiento = pacfechanacimiento;
    }

    public String getPacidentificacion() {
        return pacidentificacion;
    }

    public void setPacidentificacion(String pacidentificacion) {
        this.pacidentificacion = pacidentificacion;
    }

    public String getPacnombres() {
        return pacnombres;
    }

    public void setPacnombres(String pacnombres) {
        this.pacnombres = pacnombres;
    }

    public String getPacapellidos() {
        return pacapellidos;
    }

    public void setPacapellidos(String pacapellidos) {
        this.pacapellidos = pacapellidos;
    }

    public Character getPacsexo() {
        return pacsexo;
    }

    public void setPacsexo(Character pacsexo) {
        this.pacsexo = pacsexo;
    }

    public Date getPacfechanacimiento() {
        return pacfechanacimiento;
    }

    public void setPacfechanacimiento(Date pacfechanacimiento) {
        this.pacfechanacimiento = pacfechanacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pacidentificacion != null ? pacidentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.pacidentificacion == null && other.pacidentificacion != null) || (this.pacidentificacion != null && !this.pacidentificacion.equals(other.pacidentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Pacientes[ pacidentificacion=" + pacidentificacion + " ]";
    }
    
}
