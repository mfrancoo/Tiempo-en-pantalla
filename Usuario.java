public class Usuario {

    private String nombre;
    private String ocupacion;
    private int metaUso;

    public Usuario() {}
    public Usuario(String nombre, String ocupacion, int metaUso) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.metaUso = metaUso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getOcupacion() {
        return this.ocupacion;
    }

    public int getMetaUso() {
        return this.metaUso;
    }

    public void mostrarMetaUso() {
        System.out.println("La meta que te propusiste es "+this.metaUso+" horas");
    }
}
