public class ReglaEspecial implements Interface{

    @Override
    public boolean es_aplicable(String sku) {
        return (sku.startsWith("SP"));
    }

    @Override
    public double calcular_total(int cantidad, float precio, float peso) {

        double porcentaje=1;

        if(cantidad >= 9){
            porcentaje = 0.5;
        } else if (cantidad >= 6) {
            porcentaje = 0.4;
        } else if (cantidad >= 3){
            porcentaje=0.2;
        }
        return (cantidad * precio * porcentaje);
    }
}
