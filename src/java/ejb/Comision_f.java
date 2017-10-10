package ejb;

import ejb.Piloto;
import ejb.Solicitud;
import ejb.TipoComision;
import ejb.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Comision.class)
public class Comision_f { 

    public static volatile SingularAttribute<Comision, Integer> idComision;
    public static volatile SingularAttribute<Comision, Integer> kmRegreso;
    public static volatile SingularAttribute<Comision, String> informePiloto;
    public static volatile CollectionAttribute<Comision, Solicitud> solicitudCollection;
    public static volatile SingularAttribute<Comision, Date> fechaHoraSalida;
    public static volatile SingularAttribute<Comision, TipoComision> idTipoComision;
    public static volatile SingularAttribute<Comision, Integer> kmSalida;
    public static volatile SingularAttribute<Comision, Piloto> idPiloto;
    public static volatile SingularAttribute<Comision, Date> fechaHoraRegreso;
    public static volatile SingularAttribute<Comision, Vehiculo> placa;

}