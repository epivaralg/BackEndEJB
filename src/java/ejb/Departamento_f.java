package ejb;

import ejb.Municipio;
import ejb.Oficina;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Departamento.class)
public class Departamento_f { 

    public static volatile SingularAttribute<Departamento, String> descripcion;
    public static volatile CollectionAttribute<Departamento, Municipio> municipioCollection;
    public static volatile SingularAttribute<Departamento, Integer> idDepartamento;
    public static volatile CollectionAttribute<Departamento, Oficina> oficinaCollection;

}