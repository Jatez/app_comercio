public class Item {

    ManejadorReglas manejadorReglas = new ManejadorReglas();
    public Producto producto;
    public int cantidad;

    public Item(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcular_total() {
        Interface regla = manejadorReglas.crear_regla(producto.sku);
        return regla.calcular_total(cantidad, producto.precio_unitario, producto.peso);
    }
}
