package datos;
import domain.ProductoMac;
import excepciones.*;
import java.util.List;

public interface IAccesoDatos {

    boolean existe() throws AccesoDatosExcepciones;

    List<ProductoMac> listar() throws LecturaDatosExcepciones;

    void escribir(ProductoMac productoMac, boolean anexar) throws EscrituraDatosExcepciones;

    String buscar( String buscar) throws LecturaDatosExcepciones;

    void crear() throws AccesoDatosExcepciones;

    void borrar() throws AccesoDatosExcepciones;

}
