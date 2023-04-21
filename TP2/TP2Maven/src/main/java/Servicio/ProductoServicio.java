package Servicio;

import Entidades.Fabricante;
import Entidades.Producto;
import Persistencia.ProductoDao;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicio {

    private ProductoDao productoDao = new ProductoDao();

    public void mostrarProductos() throws Exception {

        try {
            List<Producto> productos = productoDao.obtenerProducto();

            if (productos.isEmpty()) {
                throw new Exception("La lista no contiene productos");
            } else {
                System.out.println("\n** Lista de Productos **\n");
                System.out.printf("%-15s%-40s%-20s%-40s\n", "CÓDIGO", "NOMBRE", "PRECIO", "FABRICANTE");

                for (Producto producto : productos) {
                    System.out.printf("%-15s%-40s%-20s%-40s\n", producto.getCodigo(), producto.getNombre(),
                            producto.getPrecio(), producto.getFabricante());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarProductosPreciosEntre200y800() throws Exception {

        try {
            List<Producto> productos = productoDao.obtenerProductosPreciosEntre200y800();

            if (productos.isEmpty()) {
                throw new Exception("La lista no contiene productos");
            } else {
                System.out.println("\n** Mostrando productos entre $200 y $800 **\n");
                System.out.printf("%-15s%-40s%-20s%-40s\n", "CÓDIGO", "NOMBRE", "PRECIO", "FABRICANTE");

                for (Producto producto : productos) {
                    System.out.printf("%-15s%-40s%-20s%-40s\n", producto.getCodigo(), producto.getNombre(),
                            producto.getPrecio(), producto.getFabricante());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarNombresProductos() throws Exception {

        try {
            List<Producto> productos = productoDao.obtenerNombresProductos();

            if (productos.isEmpty()) {
                throw new Exception("La lista no contiene productos");
            } else {
                System.out.println("\n** Lista de Productos **\n");
                System.out.printf("%-40s\n", "NOMBRE");

                for (Producto producto : productos) {
                    System.out.printf("%-40s\n", producto.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarNombresyPreciosProductos() throws Exception {

        try {
            List<Producto> productos = productoDao.obtenerNombresyPreciosProductos();

            if (productos.isEmpty()) {
                throw new Exception("La lista no contiene productos");
            } else {
                System.out.println("\n** Lista de Productos **\n");
                System.out.printf("%-40s%-20s\n", "NOMBRE", "PRECIO");

                for (Producto producto : productos) {
                    System.out.printf("%-40s%-20s\n", producto.getNombre(), producto.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarImpresoras() throws Exception {

        try {
            List<Producto> productos = productoDao.obtenerImpresoras();

            if (productos.isEmpty()) {
                throw new Exception("No se encontraron impresoras");
            } else {
                System.out.println("\n** Mostrando todas las impresoras **\n");
                System.out.printf("%-15s%-40s%-20s%-40s\n", "CÓDIGO", "NOMBRE", "PRECIO", "FABRICANTE");

                for (Producto producto : productos) {
                    System.out.printf("%-15s%-40s%-20s%-40s\n", producto.getCodigo(), producto.getNombre(),
                            producto.getPrecio(), producto.getFabricante());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarProductoMasBarato() throws Exception {

        try {
            List<Producto> productos = productoDao.obtenerProductoMasBarato();

            if (productos.isEmpty()) {
                throw new Exception("La lista no contiene productos");
            } else {
                System.out.println("\n** Mostrando el producto con menor precio **\n");
                System.out.printf("%-40s%-20s%-40s\n", "NOMBRE", "PRECIO", "FABRICANTE");

                for (Producto producto : productos) {
                    System.out.printf("%-40s%-20s%-40s\n", producto.getNombre(),
                            producto.getPrecio(), producto.getFabricante());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarProductoMasCaro() throws Exception {

        try {
            List<Producto> productos = productoDao.obtenerProductoMasCaro();

            if (productos.isEmpty()) {
                throw new Exception("La lista no contiene productos");
            } else {
                System.out.println("\n** Mostrando el producto con mayor precio **\n");
                System.out.printf("%-40s%-20s%-40s\n", "NOMBRE", "PRECIO", "FABRICANTE");

                for (Producto producto : productos) {
                    System.out.printf("%-40s%-20s%-40s\n", producto.getNombre(),
                            producto.getPrecio(), producto.getFabricante());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
