package ejb;

import ejb.Piloto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Grupo.class)
public class Grupo_f { 

    public static volatile SingularAttribute<Grupo, String> descripcion;
    public static volatile CollectionAttribute<Grupo, Piloto> pilotoCollection;
    public static volatile SingularAttribute<Grupo, Integer> idGrupo;

}