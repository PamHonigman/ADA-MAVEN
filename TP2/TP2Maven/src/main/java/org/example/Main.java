package org.example;

import Servicio.FabricanteServicio;
import Servicio.MenuServicios;
import Servicio.ProductoServicio;

public class Main {
    public static void main(String[] args) {

        MenuServicios menuServicios = new MenuServicios();
        try {
            menuServicios.Menu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}