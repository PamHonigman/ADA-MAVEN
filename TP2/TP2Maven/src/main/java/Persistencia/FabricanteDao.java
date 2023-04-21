package Persistencia;

import Entidades.Fabricante;

import java.util.ArrayList;
import java.util.List;

public class FabricanteDao extends Dao {

    public List<Fabricante> obtenerFabricante() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante;";

            QueryBD(sql);

            List<Fabricante> fabricantes = new ArrayList<>();
            Fabricante fabricante;

            while (resultset.next()){

                fabricante = new Fabricante();
                fabricante.setCodigo(resultset.getInt(1));
                fabricante.setNombre(resultset.getString(2));

                fabricantes.add(fabricante);
            }

            return fabricantes;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            throw new Exception("Error al obtener el fabricante");

        } finally {
            DesconectarBD();
        }




    }
}
