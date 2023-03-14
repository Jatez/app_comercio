import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManejadorReglas {
    public ManejadorReglas() {
    }

    ReglaNormal reglaNormal= new ReglaNormal();
    ReglaPeso reglaPeso = new ReglaPeso();
    ReglaEspecial reglaEspecial = new ReglaEspecial();

    public Interface crear_regla(String sku){

        if(reglaNormal.es_aplicable(sku)){
            return reglaNormal;
        } else if (reglaEspecial.es_aplicable(sku)) {
            return reglaEspecial;
        } else if (reglaPeso.es_aplicable(sku)) {
            return reglaPeso;
        }
        return null;
    }
}