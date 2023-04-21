package Servicio;

import Entidades.Fabricante;
import Persistencia.FabricanteDao;

import java.util.List;

public class FabricanteServicio {

    private FabricanteDao fabricanteDao = new FabricanteDao();

    public void mostrarFabricantes() throws Exception {

        try {
            List<Fabricante> fabricantes = fabricanteDao.obtenerFabricante();

            if (fabricantes.isEmpty()) {
                throw new Exception("No hay fabricantes registrados");

            } else {

                System.out.println("\n** Lista de fabricantes **\n");
                System.out.printf("%-15s%-40s\n", "ID", "FABRICANTE");
                for (Fabricante fabricante : fabricantes) {
                    System.out.printf("%-15s%-40s\n", fabricante.getCodigo(), fabricante.getNombre());

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
