package ejb;

import ejb.Piloto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(EstadoPiloto.class)
public class EstadoPiloto_f { 

    public static volatile SingularAttribute<EstadoPiloto, String> descripcion;
    public static volatile CollectionAttribute<EstadoPiloto, Piloto> pilotoCollection;
    public static volatile SingularAttribute<EstadoPiloto, Integer> idEstadoPiloto;

}