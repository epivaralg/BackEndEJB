package ejb;

import ejb.Departamento;
import ejb.Ruta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Municipio.class)
public class Municipio_f { 

    public static volatile SingularAttribute<Municipio, String> descripcion;
    public static volatile SingularAttribute<Municipio, Departamento> idDepartamento;
    public static volatile SingularAttribute<Municipio, Integer> idMunicipio;
    public static volatile CollectionAttribute<Municipio, Ruta> rutaCollection;

}