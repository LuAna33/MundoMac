package mundomac;
import excepciones.AccesoDatosExcepciones;
import servicio.*;
import java.util.Scanner;

public class MundoMac {
    public static void main(String[] args) throws AccesoDatosExcepciones {

        var opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoProductos catalogo = new CatalogoProductosImpl();

        while (opcion != 0) {
            System.out.println("\n"
                    + "BIENVENIDO A TU CATALOGO DE SETS PERSONALIZADOS MAC \n"
                    + "PODES ELEGIR HASTA CUATRO PRODUCTOS PARA ARMAR TU SET\n"
                    + "SELECCIONA UNA OPCION \n"
                    + " 1.INICIAR CATALOGO DE PRODUCTOS \n"
                    + " 2.AGREGAR UN PRODUCTO AL SET \n"
                    + " 3.LISTAR PRODUCTOS DISPONIBLES \n"
                    + " 4.BUSCAR PRODUCTO\n"
                    + " 0. SALIR\n");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado Iniciar el Catalogo de Productos");
                    catalogo.iniciarCatalogoProductos();
                    break;
                case 2:
                    System.out.println("Ha seleccionado Agregar un Producto al Set");
                    String nombreProducto = scanner.nextLine();
                    catalogo.agregarProducto(nombreProducto);
                    break;
                case 3:
                    System.out.println("Ha selccionado Listar Productos disponibles");
                    catalogo.listarProductos();
                    break;
                case 4:
                    System.out.println("Ha seleccionado Buscar Producto");
                    System.out.println("Ingrese el nombre del Producto a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarProducto(buscar);
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
}


