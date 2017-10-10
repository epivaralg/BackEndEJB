package ejb;

import ejb.Piloto;
import ejb.TipoLicencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Licencia.class)
public class Licencia_f { 

    public static volatile SingularAttribute<Licencia, Integer> idLicencia;
    public static volatile SingularAttribute<Licencia, String> numero;
    public static volatile SingularAttribute<Licencia, Date> fechaVencimiento;
    public static volatile SingularAttribute<Licencia, Piloto> idPiloto;
    public static volatile SingularAttribute<Licencia, TipoLicencia> idTipoLicencia;

}