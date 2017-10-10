package ejb;

import ejb.Comision;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(TipoComision.class)
public class TipoComision_f { 

    public static volatile SingularAttribute<TipoComision, String> descripcion;
    public static volatile CollectionAttribute<TipoComision, Comision> comisionCollection;
    public static volatile SingularAttribute<TipoComision, Integer> idTipoComision;

}