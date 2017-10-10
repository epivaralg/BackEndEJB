package ejb;

import ejb.Marca;
import ejb.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Linea.class)
public class Linea_f { 

    public static volatile SingularAttribute<Linea, String> descripcion;
    public static volatile SingularAttribute<Linea, Integer> idLinea;
    public static volatile SingularAttribute<Linea, Marca> idMarca;
    public static volatile CollectionAttribute<Linea, Vehiculo> vehiculoCollection;

}