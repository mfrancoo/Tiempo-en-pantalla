import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {
    // almacena en txt el tiempo promedio de cada día
    String ruta = "/home/mario/archivo.txt";
    File archivo = new File(ruta);
    BufferedWriter bw; {}
    if(archivo.exists()) {
      // El fichero ya existe
    } else {
      // El fichero no existe y hay que crearlo
    }
}