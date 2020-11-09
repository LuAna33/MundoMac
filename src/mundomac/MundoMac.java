package mundomac;

import java.util.Scanner;

public class MundoMac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        var opcion = -1;
        while (opcion != 0) {
            System.out.println("\n"
                    + "BIENVENIDO A TU CATALOGO DE SETS MAC \n"
                    + "PODES ELEGIR HASTA CUATRO PRODUCTOS\n"
                    + "SELECCIONA UNA OPCION \n"
                    + " 1.INICIAR CATALOGO DE PRODUCTOS \n"
                    + " 2.AGREGAR UN PRODUCTO AL SET \n"
                    + " 3.LISTAR PRODUCTOS DISPONIBLES \n"
                    + " 4.BUSCAR PRODUCTO\n"
                    + " 0. SALIR\n");
        }
        opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado Iniciar el Catalogo de Productos");
                //catalogo.iniciarCatalogoProductos();
                break;
            case 2:
                System.out.println("Ha seleccionado Agregar un Producto al Set");
                //String nombrePelicula = scanner.nextLine();
                //catalogo.agregarPelicula(nombrePelicula);
                break;
            case 3:
                System.out.println("Ha selccionado Listar Productos disponibles");
                //catalogo.listarPeliculas();
                break;
            case 4:
                System.out.println("Ha seleccionado Buscar Producto");
                System.out.println("Ingrese el nombre del Producto a buscar");
                //var buscar = scanner.nextLine();
                //catalogo.buscarPeliculas(buscar);
                break;
            case 0:
                System.out.println("GRACIAS POR TU VISITA. ¡HASTA PRONTO!");
                break;
            default:
                System.out.println("Vuelva a intentarlo.La opcion ingresada no es correcta. ");
                break;
        }
    }
}


