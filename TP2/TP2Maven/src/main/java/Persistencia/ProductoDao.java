package Persistencia;

import Entidades.Fabricante;
import Entidades.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDao extends Dao {

    public List<Producto> obtenerProducto() throws Exception {

        try {
            String sql = "SELECT * FROM producto P JOIN fabricante F ON P.codigo_fabricante = F.codigo;";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultset.getInt(1));
                producto.setNombre(resultset.getString(2));
                producto.setPrecio(resultset.getDouble(3));

                fabricante.setCodigo(resultset.getInt(5));
                fabricante.setNombre(resultset.getString(6));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener el productos");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> obtenerProductosPreciosEntre200y800() throws Exception {
        try {
            String sql = "select * from producto P JOIN fabricante F ON " +
                    "P.codigo_fabricante = F.codigo where P.precio >= 200 and P.precio <= 800;";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultset.getInt(1));
                producto.setNombre(resultset.getString(2));
                producto.setPrecio(resultset.getDouble(3));

                fabricante.setCodigo(resultset.getInt(5));
                fabricante.setNombre(resultset.getString(6));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los resultados de la búsqueda");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> obtenerNombresProductos() throws Exception {

        try {
            String sql = "SELECT nombre from producto;";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultset.getString(1));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los resultados de la búsqueda");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> obtenerNombresyPreciosProductos() throws Exception {

        try {
            String sql = "SELECT nombre, precio from producto;";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultset.getString(1));
                producto.setPrecio(resultset.getDouble(2));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los resultados de la búsqueda");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> obtenerImpresoras() throws Exception {

        try {
            String sql = "SELECT * FROM producto P JOIN fabricante F " +
                    "ON P.codigo_fabricante = F.codigo where P.nombre like \"impresora%\";";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultset.getInt(1));
                producto.setNombre(resultset.getString(2));
                producto.setPrecio(resultset.getDouble(3));

                fabricante.setCodigo(resultset.getInt(5));
                fabricante.setNombre(resultset.getString(6));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los resultados de la búsqueda");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> obtenerProductoMasBarato() throws Exception {

        try {
            String sql = "SELECT P.nombre, P.precio, F.codigo, F.nombre from producto P JOIN fabricante F ON " +
                    "F.codigo = P.codigo_fabricante where precio = (select min(precio) from producto);";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultset.getString(1));
                producto.setPrecio(resultset.getDouble(2));

                fabricante.setCodigo(resultset.getInt(3));
                fabricante.setNombre(resultset.getString(4));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los resultados de la búsqueda");
        } finally {
            DesconectarBD();
        }
    }
    public List<Producto> obtenerProductoMasCaro() throws Exception {

        try {
            String sql = "SELECT P.nombre, P.precio, F.codigo, F.nombre from producto P JOIN fabricante F ON " +
                    "F.codigo = P.codigo_fabricante where precio = (select max(precio) from producto);";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultset.getString(1));
                producto.setPrecio(resultset.getDouble(2));

                fabricante.setCodigo(resultset.getInt(3));
                fabricante.setNombre(resultset.getString(4));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los resultados de la búsqueda");
        } finally {
            DesconectarBD();
        }
    }

}
