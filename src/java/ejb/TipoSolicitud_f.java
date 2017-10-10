package ejb;

import ejb.Solicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(TipoSolicitud.class)
public class TipoSolicitud_f { 

    public static volatile SingularAttribute<TipoSolicitud, String> descripcion;
    public static volatile SingularAttribute<TipoSolicitud, Integer> idTipoSolicitud;
    public static volatile CollectionAttribute<TipoSolicitud, Solicitud> solicitudCollection;

}