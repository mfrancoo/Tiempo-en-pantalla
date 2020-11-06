public class Usuario{
        private String nombre;
        private String ocupacion;
        private int metaUso;
        public void ingresarDatosUsuario(String n, String o, int m){
            this.nombre = n;
            this.ocupacion = o;
            this.metaUso = m;
        }
        public String getNombre(){
            return this.nombre;
        }
}
