public class Usuario{
        private String nombre;
        private String ocupacion;
        private int metaUso;
        public void ingresarDatosUsuario(String n, String o, int m){
            this.nombre = n;
            this.ocupacion = o;
            this.metaUso = m;
            System.out.println("Sus datos se han almacenado correctamente");
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getOcupacion(){
            return this.ocupacion;
        }
        public int getMetaUso(){
            return this.metaUso;
        }
}
