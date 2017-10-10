package ejb;

import ejb.RazonEstado;
import ejb.Solicitud;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(HistoriaEstado.class)
public class HistoriaEstado_f { 

    public static volatile SingularAttribute<HistoriaEstado, Date> fechaHoraEstado;
    public static volatile SingularAttribute<HistoriaEstado, Integer> idHistoriaEstado;
    public static volatile SingularAttribute<HistoriaEstado, RazonEstado> idRazonEstado;
    public static volatile SingularAttribute<HistoriaEstado, Solicitud> idSolicitud;
    public static volatile SingularAttribute<HistoriaEstado, String> comentario;

}