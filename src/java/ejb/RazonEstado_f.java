package ejb;

import ejb.EstadoSolicitud;
import ejb.HistoriaEstado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(RazonEstado.class)
public class RazonEstado_f { 

    public static volatile SingularAttribute<RazonEstado, String> descripcion;
    public static volatile CollectionAttribute<RazonEstado, HistoriaEstado> historiaEstadoCollection;
    public static volatile SingularAttribute<RazonEstado, Integer> idRazonEstado;
    public static volatile SingularAttribute<RazonEstado, EstadoSolicitud> idEstadoSolicitud;

}