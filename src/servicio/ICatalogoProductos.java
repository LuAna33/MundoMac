package servicio;

public interface ICatalogoProductos {

        void agregarProducto (String nombreProducto);
        void listarProductos();
        void buscarProducto(String buscarProducto);
        void iniciarCatalogoProductos();
    }

