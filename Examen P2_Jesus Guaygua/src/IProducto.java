//ANTHONY JESUS GUAYGUA ASIMBAYA, EXAMEN P2



public interface IProducto {
    String getModelo();
    String getMarca();
    double getPrecio();

    default int getGarantia() {
        return 0;
    }

    void imprimeDetallesProducto();

}