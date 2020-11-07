import java.util.*;
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // PERSISTENCIA
        /**
         * Persistencia.crearFichero(); 
         * Persistencia.escribirAFichero();
         */

        while (true) { // mini menú de prueba
            int comando = scan.nextInt();
            if (comando == 1) {
                Procesamiento.iniciarTiempo();
            } else if (comando == 2) {
                Procesamiento.finalizarTiempo();
                Procesamiento.calcularTiempoUso();
                break;
            } 
        }
    
        scan.close();
    }
}
