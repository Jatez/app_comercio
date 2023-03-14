public class Producto {

    public String sku;
    public String nombre;

    public String descripcion;
    public int unidades_disponibles;
    public float precio_unitario;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades_disponibles() {
        return unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades_disponibles) {
        this.unidades_disponibles = unidades_disponibles;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Producto(String sku, String nombre, String descripcion, int unidades_disponibles, float precio_unitario, float peso) {
        this.sku = sku;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidades_disponibles = unidades_disponibles;
        this.precio_unitario = precio_unitario;
        this.peso = peso;
    }

    public float peso;

}