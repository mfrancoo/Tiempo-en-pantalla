import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Procesamiento {

    private double tDiario;
    private double tSemanal;
    private static LocalDateTime tInicio;
    private static LocalDateTime tFin;

    public static void iniciarTiempo() { // tiempo de inicio
        tInicio = LocalDateTime.now();
        System.out.println(tInicio);
    }

    public static void finalizarTiempo() { // tiempo de fin 
        tFin = LocalDateTime.now();
        System.out.println(tFin);
    }

    public static void calcularTiempoUso() {
        long duracion = tInicio.until(tFin, ChronoUnit.MINUTES);
        System.out.println("Su sesión duro " + duracion + " minutos");
    }
}
