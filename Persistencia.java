import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Persistencia {

    public static void escribirAFichero(String datos) {

        File file = new File("RegistroSesionesMinutos.txt");
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileWriter(file, true));
            output.println(Procesamiento.tDiario); // minutos
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (output != null) {
                output.close();

            }
        }
    } 
}
