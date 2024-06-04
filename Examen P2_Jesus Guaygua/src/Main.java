//ANTHONY JESUS GUAYGUA ASIMBAYA, EXAMEN P2

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        // Agregar productos
        tienda.agregarProducto(new Telefono("Galaxy S21", "Samsung", 800.00));
        tienda.agregarProducto(new Laptop("MacBook Pro", "Apple", 2500.00, 2));
        tienda.agregarProducto(new Tablet("IpadAir", "Apple", 1100.00));

        // Listar productos
        System.out.println("Lista de productos:");
        tienda.listarProductos();

        // Obtener promedio de precios de los productos ($1466)
        double promedio = tienda.obtenerPromedioPrecioProductos();
        System.out.println("\nEl promedio de los precios de los productos es: "+promedio);


        // Obtener el producto más costoso (MacBook Pro)
        IProducto producto_mas_costoso = tienda.obtenerProductoMasCostoso();
        System.out.println("\nEl producto más costoso es: "+producto_mas_costoso.getModelo());


        //Por puntos extras... incluir aquí el método
        Boolean existe = tienda.buscarProductoPorNombre("MacBook Pro");
        if(existe){
            System.out.println("SI existe el producto");
        }
        else{
            System.out.println("NO existe el producto");
        }

    }
}