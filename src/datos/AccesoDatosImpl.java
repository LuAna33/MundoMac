package datos;

import domain.ProductoMac;
import excepciones.AccesoDatosExcepciones;
import excepciones.LecturaDatosExcepciones;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl {
    private String archivoDatos;

    public AccesoDatosImpl(String archivoDatos){

        this.archivoDatos = archivoDatos;
    }

    @Override
    public boolean existe() throws AccesoDatosExcepciones {
        File archivo = new File(archivoDatos);
        return archivo.exists();
    }

    @Override
    public List<ProductoMac> listar() throws LecturaDatosExcepciones {
        File archivo = new File(archivoDatos);
        List<ProductoMac> productos = new ArrayList<ProductoMac>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while(linea != null){
                ProductoMac producto = new ProductoMac(linea);
                productos.add(producto);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException a) {
            a.printStackTrace();
            throw new LecturaDatosExcepciones("Se produjo un error al listar peliculas:" + a.getMessage());
        } catch (IOException a) {
            a.printStackTrace();
            throw new LecturaDatosExcepciones("Se produjo un error al listar peliculas:" + a.getMessage());
        }
        return productos;
    }

    @Override
    public void escribir (ProductoMac producto, boolean anexar) throws EscrituraDatosExcepciones {
        File archivo = new File(archivoDatos);
        try {
            PrintWriter salida = new PrintWriter (new FileWriter(archivo, anexar));
            salida.println(producto.toString());
            salida.close();
            System.out.println("Ha ingresado el producto: " + producto);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosExcepciones("Se produjo un error al escribir peliculas:" + e.getMessage());
        }
    }

    @Override
    public String buscar( String buscar) throws LecturaDatosExcepciones {
        File archivo = new File(archivoDatos);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;

            while (linea != resultado) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    return "El Producto: " + linea + ". Ha sido  encontrado en el numero de indice: " + indice;
                }
                linea = entrada.readLine();
                indice ++;
            }
            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosExcepciones ("Se produjo un error al buscar el producto:" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosExcepciones ("Se produjo un error al buscar el producto:" + e.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear() throws AccesoDatosExcepciones {
        File archivo = new File(archivoDatos);
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosExcepciones("Se produjo una excepcion crear el archivo: " + e.getMessage());
        }
    }

    @Override
    public void borrar() throws AccesoDatosExcepciones {

        File archivo = new File(archivoDatos);
        if (archivo.exists()){
            archivo.delete();
            //System.out.println("El archivo ha sido borrado");

        }
    }
}

