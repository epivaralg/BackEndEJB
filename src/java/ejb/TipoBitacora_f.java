package ejb;

import ejb.Bitacora;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(TipoBitacora.class)
public class TipoBitacora_f { 

    public static volatile SingularAttribute<TipoBitacora, String> descripcion;
    public static volatile SingularAttribute<TipoBitacora, Integer> idTipoBitacora;
    public static volatile CollectionAttribute<TipoBitacora, Bitacora> bitacoraCollection;

}