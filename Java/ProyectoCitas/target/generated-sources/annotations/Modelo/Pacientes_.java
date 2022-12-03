package Modelo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-02T22:08:22", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Pacientes.class)
public class Pacientes_ { 

    public static volatile SingularAttribute<Pacientes, String> pacnombres;
    public static volatile SingularAttribute<Pacientes, Character> pacsexo;
    public static volatile SingularAttribute<Pacientes, String> pacidentificacion;
    public static volatile SingularAttribute<Pacientes, Date> pacfechanacimiento;
    public static volatile SingularAttribute<Pacientes, String> pacapellidos;

}