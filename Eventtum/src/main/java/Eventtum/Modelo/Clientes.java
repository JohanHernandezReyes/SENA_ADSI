
package Eventtum.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name="tblclientes")
@Data
public class Clientes implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "idcliente")
    private Integer idCliente;
    
    @Column(name= "NIT")
    private String NIT;
    
    @Column(name= "clinombre_razonsocial")
    private String name;
    
    @Column(name= "clitelefono")
    private String tel;
  
    @Column(name="clidireccion")
    private String direccion;
    
    @Column(name="clifecharegistro")
    private Date fechareg;
    
    @Column(name= "tblciudad_idciudad")
    private Integer idCiudad;
    
    @OneToOne
    @JsonIgnoreProperties("Clientes")
    private Usuarios tblusuarios; 
    
    @Column(name= "tbltipoid_idtipoid")
    private Integer tipoID;
    
}