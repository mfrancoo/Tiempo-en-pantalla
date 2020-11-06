import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {
    // almacena en txt el tiempo promedio de cada día
    String ruta = "/home/mario/archivo.txt";
    File archivo = new File(ruta);
    BufferedWriter bw;
    if(archivo.exists()) {
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("El fichero de texto ya estaba creado.");
    } else {
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("Acabo de crear el fichero de texto.");
    }
}