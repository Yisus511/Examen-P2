//ANTHONY JESUS GUAYGUA ASIMBAYA, EXAMEN P2



import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda{
    private List<IProducto> productos;
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    //Implementar los métodos
    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }
    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }


// Obtener promedio de precios de los productos ($1466)
    @Override
    public double obtenerPromedioPrecioProductos() {
        double total = 0;
        for (IProducto producto : productos) {
            total += producto.getPrecio();
        }
        return total / productos.size();
    }
// Obtener el producto más costoso (MacBook Pro)
@Override
public IProducto obtenerProductoMasCostoso() {
    if (productos.isEmpty()) {    // isEmpty() de la clase String es un método que devuelve true, https://www.w3api.com/Java/String/isEmpty/
        return null;
    }
    IProducto masCostoso = productos.get(0);
    for (int i = 1; i < productos.size(); i++) {
        if (productos.get(i).getPrecio() > masCostoso.getPrecio()) {
            masCostoso = productos.get(i);
        }
    }
    return masCostoso;
}
//Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String nombre){
        //Implementar método
        for (IProducto producto : productos) {
            if (producto.getModelo().equals(nombre)) { // equals() es igual que usar ==,solo que todas las clases heredan automáticamente de Object, https://www.drk.com.ar/para-qu%C3%A9-sirve-equals-en-java/
                return true;
            }
        }
        return false;
    }
}