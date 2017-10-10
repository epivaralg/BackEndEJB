package ejb;

import ejb.Linea;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Marca.class)
public class Marca_f { 

    public static volatile SingularAttribute<Marca, String> descripcion;
    public static volatile CollectionAttribute<Marca, Linea> lineaCollection;
    public static volatile SingularAttribute<Marca, Integer> idMarca;

}