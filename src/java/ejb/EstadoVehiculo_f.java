package ejb;

import ejb.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(EstadoVehiculo.class)
public class EstadoVehiculo_f { 

    public static volatile SingularAttribute<EstadoVehiculo, String> descripcion;
    public static volatile SingularAttribute<EstadoVehiculo, Integer> idEstadoVehiculo;
    public static volatile CollectionAttribute<EstadoVehiculo, Vehiculo> vehiculoCollection;

}