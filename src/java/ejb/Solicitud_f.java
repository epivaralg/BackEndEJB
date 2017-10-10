package ejb;

import ejb.Comision;
import ejb.HistoriaEstado;
import ejb.Ruta;
import ejb.TipoSolicitud;
import ejb.TipoUsoVehiculo;
import ejb.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Solicitud.class)
public class Solicitud_f { 

    public static volatile SingularAttribute<Solicitud, String> nombreEncargado;
    public static volatile SingularAttribute<Solicitud, Comision> idComision;
    public static volatile SingularAttribute<Solicitud, TipoSolicitud> idTipoComision;
    public static volatile SingularAttribute<Solicitud, Usuario> idUsuario;
    public static volatile SingularAttribute<Solicitud, Usuario> idUsuarioGestor;
    public static volatile SingularAttribute<Solicitud, Integer> idSolicitud;
    public static volatile SingularAttribute<Solicitud, String> adicional1;
    public static volatile SingularAttribute<Solicitud, String> comentario;
    public static volatile SingularAttribute<Solicitud, String> adicional2;
    public static volatile SingularAttribute<Solicitud, String> adicional3;
    public static volatile SingularAttribute<Solicitud, String> adicional4;
    public static volatile SingularAttribute<Solicitud, Usuario> idUsuarioAprobador;
    public static volatile SingularAttribute<Solicitud, Date> fechaHoraSalida;
    public static volatile CollectionAttribute<Solicitud, HistoriaEstado> historiaEstadoCollection;
    public static volatile SingularAttribute<Solicitud, Integer> cantidadPasajeros;
    public static volatile SingularAttribute<Solicitud, Date> fechaHoraSolicitud;
    public static volatile SingularAttribute<Solicitud, String> telefono;
    public static volatile SingularAttribute<Solicitud, Date> fechaHoraRegreso;
    public static volatile CollectionAttribute<Solicitud, Ruta> rutaCollection;
    public static volatile SingularAttribute<Solicitud, String> usuarioPdh;
    public static volatile SingularAttribute<Solicitud, TipoUsoVehiculo> idTipoUsoVehiculo;

}