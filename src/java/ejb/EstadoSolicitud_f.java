package ejb;

import ejb.RazonEstado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(EstadoSolicitud.class)
public class EstadoSolicitud_f { 

    public static volatile SingularAttribute<EstadoSolicitud, String> descripcion;
    public static volatile CollectionAttribute<EstadoSolicitud, RazonEstado> razonEstadoCollection;
    public static volatile SingularAttribute<EstadoSolicitud, Integer> idEstadoSolicitud;

}