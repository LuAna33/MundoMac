package servicio;

import datos.*;
import domain.ProductoMac;
import excepciones.*;

public class CatalogoProductosImpl implements ICatalogoProductos {
    private final IAccesoDatos datos;

    public CatalogoProductosImpl(){
        this.datos = new AccesoDatosImpl("catalogoProductosMac.txt");
    }

    @Override
    public void agregarProducto(String nombreProducto) {
        ProductoMac productoMac = new ProductoMac(nombreProducto);
        boolean anexar = false;
    }

    @Override
    public void listarProductos() {
        try {
            var productos = datos.listar();
            for (var producto: productos){
                System.out.println("Producto MAC: " + producto);
            }
        } catch (LecturaDatosExcepciones lecturaDatosExcepciones) {
            lecturaDatosExcepciones.printStackTrace();
            System.out.println("Se ha producido un error. No ha sido posible Listar");
        }
    }

    @Override
    public void buscarProducto(String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(buscar);

        } catch ( LecturaDatosExcepciones lecturaDatosExcepciones) {
            lecturaDatosExcepciones.printStackTrace();
            System.out.println("Se ha producido un error. No es posible buscar el producto solicitado");
        }
        System.out.println("Resultado: " + resultado);

    }

    @Override
    public void iniciarCatalogoProductos() throws AccesoDatosExcepciones {
        if (this.datos.existe()) {
            datos.borrar();
            datos.crear();
        }
        else{
            datos.crear();
        }
    }
}
