package ejb;

import ejb.Solicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(TipoUsoVehiculo.class)
public class TipoUsoVehiculo_f { 

    public static volatile SingularAttribute<TipoUsoVehiculo, String> descripcion;
    public static volatile CollectionAttribute<TipoUsoVehiculo, Solicitud> solicitudCollection;
    public static volatile SingularAttribute<TipoUsoVehiculo, Integer> idTipoUsoVehiculo;

}