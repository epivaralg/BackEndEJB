package ejb;

import ejb.Departamento;
import ejb.Unidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Oficina.class)
public class Oficina_f { 

    public static volatile SingularAttribute<Oficina, String> descripcion;
    public static volatile CollectionAttribute<Oficina, Unidad> unidadCollection;
    public static volatile SingularAttribute<Oficina, Departamento> idDepartamento;
    public static volatile SingularAttribute<Oficina, Integer> idOficina;

}