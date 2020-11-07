import java.io.File;
import java.io.IOException;
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
        try {
            FileWriter myWriter = new FileWriter("RegistrosUsoDiario.txt");
            myWriter.write(datos);
            myWriter.close();
            System.out.println("Su registro sa ha almacenado.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }
    }
}
