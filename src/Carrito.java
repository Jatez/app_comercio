import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrito {
    public float valor_total;
    public ArrayList<Item> productos_carrito;

    public float getValor_total() {
        return valor_total;
    }
    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Carrito() {
        this.valor_total = 0;
        this.productos_carrito = new ArrayList<Item>();
        this.fecha = "";
    }

    public String fecha;

    public void agregar_producto(Item item){
        if (item.getProducto().getUnidades_disponibles() < item.getCantidad()){
            System.out.println("No hay suficiente cantidad del producto: " + item.getProducto().getNombre());
            return;
        }
            productos_carrito.add(item);
            item.getProducto().setUnidades_disponibles(item.getProducto().getUnidades_disponibles() - item.getCantidad());
    }

    public void eliminar_producto(Item item){
        productos_carrito.remove(item);
        item.getProducto().setUnidades_disponibles(item.getProducto().getUnidades_disponibles() + item.getCantidad());
    }

    public void calcular_total(){
        double acum=0;
        for (int i=0; i<productos_carrito.size();i++){
            Item item = productos_carrito.get(i);
            acum += item.calcular_total();
        }
        System.out.println("El total del carrito es: " + acum);
    }
}
