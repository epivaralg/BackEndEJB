package ejb;

import ejb.Licencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(TipoLicencia.class)
public class TipoLicencia_f { 

    public static volatile SingularAttribute<TipoLicencia, String> descripcion;
    public static volatile SingularAttribute<TipoLicencia, Integer> idTipoLicencia;
    public static volatile CollectionAttribute<TipoLicencia, Licencia> licenciaCollection;

}