package ejb;

import ejb.Comision;
import ejb.EstadoVehiculo;
import ejb.Linea;
import ejb.TipoVehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T16:18:24")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_f { 

    public static volatile SingularAttribute<Vehiculo, TipoVehiculo> idTipoVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> motor;
    public static volatile SingularAttribute<Vehiculo, Linea> idLinea;
    public static volatile SingularAttribute<Vehiculo, String> color;
    public static volatile CollectionAttribute<Vehiculo, Comision> comisionCollection;
    public static volatile SingularAttribute<Vehiculo, String> adicional1;
    public static volatile SingularAttribute<Vehiculo, String> adicional2;
    public static volatile SingularAttribute<Vehiculo, Integer> modelo;
    public static volatile SingularAttribute<Vehiculo, String> adicional3;
    public static volatile SingularAttribute<Vehiculo, String> combustible;
    public static volatile SingularAttribute<Vehiculo, String> adicional4;
    public static volatile SingularAttribute<Vehiculo, String> chasis;
    public static volatile SingularAttribute<Vehiculo, EstadoVehiculo> idEstadoVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}