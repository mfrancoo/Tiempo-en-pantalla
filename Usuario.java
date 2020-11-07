public class Usuario {

    private String nombre;
    private String ocupacion;
    private int metaUso;
    public static String nombreCopia;
    public static int metaUsoCopia;

    public Usuario() {
    }

    public Usuario(String nombre, String ocupacion, int metaUso) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.metaUso = metaUso;
        metaUsoCopia = metaUso;
        nombreCopia = nombre;
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

    @Override
    public String toString() {
        return "- "+this.nombre+" -\n"+this.ocupacion+"\nMeta de uso diario: "+this.metaUso;
    }

    public String enviarAPersistencia() {
        return "";
    }
}