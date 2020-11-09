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
    }
}