package RESTalquiler;

import RESTalquiler.Cliente;
import RESTalquiler.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-07T15:15:14")
@StaticMetamodel(Alquileres.class)
public class Alquileres_ { 

    public static volatile SingularAttribute<Alquileres, Date> devolucion;
    public static volatile SingularAttribute<Alquileres, Cliente> idCliente;
    public static volatile SingularAttribute<Alquileres, Integer> idAlquiler;
    public static volatile SingularAttribute<Alquileres, Date> retiro;
    public static volatile SingularAttribute<Alquileres, Producto> idPelicula;

}