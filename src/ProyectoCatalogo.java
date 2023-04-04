import entidades.*;
import java.util.Date;


public class ProyectoCatalogo {
    public static void main(String[] args) {
        Producto[] productos = new Producto[7];

        productos[0] = new Libro(15000, new Date(), "J.K. Rowling", "Harry Potter y la Piedra Filosofal", "Salamandra");
        productos[1] = new Libro(12000, new Date(), "Gabriel Garcia Marquez", "Cien años de soledad", "Oveja Negra");
        productos[2] = new Comics(35000, new Date(), "Frank Miller", "Batman: El Regreso del Caballero Oscuro", "DC Comics", "Batman");
        productos[3] = new Comics(28000, new Date(), "Stan Lee", "The Amazing Spider-Man #1", "Marvel Comics", "Spider-Man");
        productos[4] = new TvLcd(250000, "Samsung", 55);
        productos[5] = new Iphone(800000, "Apple", "iPhone 12 Pro", "Gris espacial");
        productos[6] = new Iphone(700000, "Apple", "iPhone SE", "Rojo");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
            System.out.println("Precio venta: " + producto.getPrecioVenta());
            System.out.println("-----------------------");
        }
    }
}
