//ANTHONY JESUS GUAYGUA ASIMBAYA, EXAMEN P2



public class Tablet implements IProducto {
    private String nombre;
    private String marca;
    private double precio;
    private int garantia;


    //Definir el constructor
    public Tablet(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }
    //Implementar los métodos

    @Override
    public String getModelo() {
        return nombre;
    }


    @Override
    public String getMarca() {
        return marca;
    }

   @Override
   public double getPrecio() {
        return precio;
    }
    @Override
    public int getGarantia(){
        return garantia;
    }

   @Override
   public void imprimeDetallesProducto() {
       System.out.println("Tablet: " + nombre + ", Marca: " + marca + ", Precio: $" + precio);
    }
}