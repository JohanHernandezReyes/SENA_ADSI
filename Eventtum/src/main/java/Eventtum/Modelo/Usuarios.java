
package Eventtum.Modelo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name="tblusuarios")
@Data
public class Usuarios implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "idusuario")
    private Integer id;
    
    @Column(name= "usunombre")
    private String name;
        
    @Column(name="usucontrasena", length = 8)
    private String password;
    
    @Column(name= "usuemail")
    private String email;
    
    @Column(name= "tbroles_idrol")
    private Integer idRol;


}