public class Main {
    public static void main(String[] args) {

        // Crear Productos
        Producto camiseta = new Producto("EA","camiseta","camiseta manga corta",20,1000,20);
        Producto pantalon = new Producto("WE","pantalon","panatalon manga corta",20,1000,30);
        Producto zapato = new Producto("SP","zapato","zapato manga corta",20,1000,20);

        Item item1 = new Item(camiseta,21);
        Item item2 = new Item(pantalon,2);
        Item item3 = new Item(zapato,2);

        Carrito carrito = new Carrito();
        carrito.agregar_producto(item1);
        carrito.agregar_producto(item2);
        carrito.agregar_producto(item3);
        carrito.calcular_total();
    }
}