package ejb;

import ejb.Municipio;
import ejb.Solicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Ruta.class)
public class Ruta_f { 

    public static volatile SingularAttribute<Ruta, String> direccion;
    public static volatile SingularAttribute<Ruta, Municipio> idMunicipio;
    public static volatile SingularAttribute<Ruta, Solicitud> idSolicitud;
    public static volatile SingularAttribute<Ruta, Integer> idRuta;

}