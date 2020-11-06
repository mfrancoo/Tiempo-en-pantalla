import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {

    public static void main(String[] args) throws IOException {
        String ruta = "D:/Laura/Local/Software/_Universidad/PDS (2020-2)/Tiempo-en-pantalla/Tiempo-en-pantalla/tiempoPromedioDias.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
    }
    
}