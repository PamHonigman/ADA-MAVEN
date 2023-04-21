package Servicio;

import java.rmi.server.ExportException;
import java.util.Scanner;

public class MenuServicios {

    ProductoServicio productoServicios = new ProductoServicio();
    FabricanteServicio fabricanteServicio = new FabricanteServicio();

    Scanner in = new Scanner(System.in);

    public void Menu() throws Exception {
        try {
            System.out.println("\n---------- MENÚ ---------- \n\n"
                    + "a) Ver todos los productos registrados\n"
                    + "b) Ver precios y nombres de todos los productos registrados\n"
                    + "c) Buscar productos entre $200 y $800\n"
                    + "d) Buscar todas las impresoras registradas\n"
                    + "e) Buscar el producto con el precio más bajo\n"
                    + "f) Buscar el producto con el precio más alto\n"
                    + "g) Ver todos los fabricantes registrados\n"
                    + "h) Salir");

            System.out.print("\nIngrese la opción seleccionada: ");
            String respuesta = in.next();
            opcionSeleccionada(respuesta);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("\nDebe ingresar una opción válida");
        }
    }

    public void opcionSeleccionada(String respuesta) throws Exception {
        try {
            switch (respuesta.toLowerCase()) {

                case "a":
                    productoServicios.mostrarProductos();
                    Menu();
                    break;
                case "b":
                    productoServicios.mostrarNombresyPreciosProductos();
                    Menu();
                    break;
                case "c":
                    productoServicios.mostrarProductosPreciosEntre200y800();
                    Menu();
                    break;
                case "d":
                    productoServicios.mostrarImpresoras();
                    Menu();
                    break;
                case "e":
                    productoServicios.mostrarProductoMasBarato();
                    Menu();
                    break;
                case "f":
                    productoServicios.mostrarProductoMasCaro();
                    Menu();
                    break;
                case "g":
                    fabricanteServicio.mostrarFabricantes();
                    Menu();
                    break;
                case "h":
                    System.out.println("\n** Consulta finalizada **");
                    break;
                default:
                    System.out.println("\n** Ingrese una opción válida **");
                    Menu();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
                throw new Exception("No se pudo ejecutar la consulta");
        }
    }
}
