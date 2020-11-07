import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Procesamiento {

    private static LocalDateTime tInicio;
    private static LocalDateTime tFin;
    private static long tDiario;
    private static long tSemanal;
    public static ArrayList<LocalDateTime> sesiones = new ArrayList<>();
    public static ArrayList<Long> promediosDiarios = new ArrayList<>();

    public static void iniciarTiempo() { // hora y fecha de inicio
        tInicio = LocalDateTime.now();
        sesiones.add(tInicio);
        System.out.println(tInicio.getHour() + ":" + tInicio.getMinute());
        System.out.println(
                "\nComienza la cuenta de tu tiempo en pantalla.\nTe recordaremos cuando sea hora de una pausa.");
    }

    public static void finalizarTiempo() { // hora y fecha de fin
        tFin = LocalDateTime.now();
        System.out.println(tFin.getHour() + ":" + tFin.getMinute());
    }

    public static void calcularPromedioDiario() {
        long tMinutos = tInicio.until(tFin, ChronoUnit.MINUTES);
        double tHoras = tMinutos / 60;
        System.out.println("\nSu sesión duró " + tHoras + " horas (" + tMinutos + " minutos\n)");
        // verificamos si es o no la primera sesión del día
        /*
         * if (tInicio.getDayOfMonth() ==
         * sesiones.get(sesiones.size()-2).getDayOfMonth() &&
         * sesiones.get(sesiones.size()-2)!=null) { tDiario += tMinutos; } else {
         * tDiario = tMinutos; promediosDiarios.add(tDiario); }
         */
    }

    public static void calcularPromedioSemanal() {
    }
}
