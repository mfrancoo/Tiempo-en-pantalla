import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Persistencia {

    public static void crearFichero() {
        try {
            File myObj = new File("HistoricoUsoDiario.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void escribirAFichero() {
        try {
            FileWriter myWriter = new FileWriter("HistoricoUsoDiario.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
