package ejb;

import ejb.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(TipoVehiculo.class)
public class TipoVehiculo_f { 

    public static volatile SingularAttribute<TipoVehiculo, Integer> idTipoVehiculo;
    public static volatile SingularAttribute<TipoVehiculo, String> descripcion;
    public static volatile CollectionAttribute<TipoVehiculo, Vehiculo> vehiculoCollection;

}