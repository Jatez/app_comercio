public class ReglaPeso implements Interface{

    @Override
    public boolean es_aplicable(String sku) {
        return (sku.startsWith("WE"));
    }

    @Override
    public double calcular_total(int cantidad, float precio, float peso) {
        return (peso/1000 * cantidad * precio);
    }
}
