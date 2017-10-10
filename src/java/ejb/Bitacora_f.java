package ejb;

import ejb.TipoBitacora;
import ejb.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Bitacora.class)
public class Bitacora_f { 

    public static volatile SingularAttribute<Bitacora, TipoBitacora> idTipoBitacora;
    public static volatile SingularAttribute<Bitacora, Integer> idBitacora;
    public static volatile SingularAttribute<Bitacora, Date> fechaHora;
    public static volatile SingularAttribute<Bitacora, String> valorNuevo;
    public static volatile SingularAttribute<Bitacora, Usuario> idUsuario;
    public static volatile SingularAttribute<Bitacora, String> tabla;
    public static volatile SingularAttribute<Bitacora, String> campo;
    public static volatile SingularAttribute<Bitacora, String> valorAnterior;

}