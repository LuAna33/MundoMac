package servicio;

import excepciones.AccesoDatosExcepciones;

public interface ICatalogoProductos {

        void agregarProducto (String nombreProducto);
        void listarProductos();
        void buscarProducto(String buscarProducto);
        void iniciarCatalogoProductos() throws AccesoDatosExcepciones;
    }

