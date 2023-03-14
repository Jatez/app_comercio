public class Usuario {

    private String documento;
    private String nombre;

    public Usuario(String documento, String nombre){
        this.setDocumento(documento);
        this.setNombre(nombre);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
