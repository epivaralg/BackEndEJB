package ejb;

import ejb.Oficina;
import ejb.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Unidad.class)
public class Unidad_f { 

    public static volatile SingularAttribute<Unidad, String> descripcion;
    public static volatile SingularAttribute<Unidad, Integer> idUnidad;
    public static volatile SingularAttribute<Unidad, Oficina> idOficina;
    public static volatile CollectionAttribute<Unidad, Usuario> usuarioCollection;

}