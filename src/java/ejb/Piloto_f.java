package ejb;

import ejb.Comision;
import ejb.EstadoPiloto;
import ejb.Grupo;
import ejb.Licencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Piloto.class)
public class Piloto_f { 

    public static volatile SingularAttribute<Piloto, Date> fechaNacimiento;
    public static volatile CollectionAttribute<Piloto, Comision> comisionCollection;
    public static volatile SingularAttribute<Piloto, String> adicional1;
    public static volatile SingularAttribute<Piloto, String> adicional2;
    public static volatile SingularAttribute<Piloto, String> nombre;
    public static volatile SingularAttribute<Piloto, String> adicional3;
    public static volatile SingularAttribute<Piloto, String> adicional4;
    public static volatile SingularAttribute<Piloto, String> usuarioPilotoPdh;
    public static volatile SingularAttribute<Piloto, String> apellido;
    public static volatile SingularAttribute<Piloto, EstadoPiloto> idEstadoPiloto;
    public static volatile SingularAttribute<Piloto, Integer> idPiloto;
    public static volatile SingularAttribute<Piloto, String> telefono;
    public static volatile SingularAttribute<Piloto, Grupo> idGrupo;
    public static volatile CollectionAttribute<Piloto, Licencia> licenciaCollection;

}