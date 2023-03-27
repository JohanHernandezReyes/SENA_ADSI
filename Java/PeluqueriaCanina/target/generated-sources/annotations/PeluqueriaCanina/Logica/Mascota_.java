package PeluqueriaCanina.Logica;

import PeluqueriaCanina.Logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T01:21:27", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Integer> num_cliente;
    public static volatile SingularAttribute<Mascota, String> nombre_perro;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, Duenio> idduenio;
    public static volatile SingularAttribute<Mascota, Boolean> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, Boolean> atencion_especial;

}