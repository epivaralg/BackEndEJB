package ejb;

import ejb.Bitacora;
import ejb.Rol;
import ejb.Solicitud;
import ejb.Unidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Usuario.class)
public class Usuario_f { 

    public static volatile SingularAttribute<Usuario, Rol> idRol;
    public static volatile CollectionAttribute<Usuario, Solicitud> solicitudCollection;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, Unidad> idUnidad;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile CollectionAttribute<Usuario, Bitacora> bitacoraCollection;
    public static volatile CollectionAttribute<Usuario, Solicitud> solicitudCollection1;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile CollectionAttribute<Usuario, Solicitud> solicitudCollection2;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> usuarioGv;
    public static volatile SingularAttribute<Usuario, String> telefono;
    public static volatile SingularAttribute<Usuario, String> usuarioPdh;
    public static volatile SingularAttribute<Usuario, Integer> activo;

}