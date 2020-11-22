import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Persistencia {
    
    public static void crearFichero() {
        try {
            File archivo = new File("RegistrosUsoDiario.txt");
            if (archivo.createNewFile()) {
                //System.out.println("Archivo creado: " + archivo.getName());
            } else {
                //System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }
    }

    public static void escribirAFichero(String datos) {

        File file = new File("Tiempo-en-pantalla/RegistroHoras.txt");
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileWriter(file, true));
            output.println(Procesamiento.tDiario); // horas
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (output != null) {
                output.close();

            }
        }
    }
}
