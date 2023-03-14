public class ReglaNormal implements Interface{

    @Override
    public boolean es_aplicable(String sku) {
        return (sku.startsWith("EA"));
    }

    @Override
    public double calcular_total(int cantidad, float precio, float peso) {
        return (cantidad * precio);
    }
}
