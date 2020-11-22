import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Procesamiento extends Usuario {

    public static LocalDateTime tInicio;
    public static LocalDateTime tFin;
    public static long tDiario;
    public static long tSemanal;
    public static ArrayList<LocalDateTime> sesiones = new ArrayList<>();
    public static ArrayList<Long> promediosDiarios = new ArrayList<>(); //minutos

    public static void iniciarTiempo() { // hora y fecha de inicio
        tInicio = LocalDateTime.now();
        sesiones.add(tInicio);
        System.out.println("\nSon las "+tInicio.getHour() + ":" + tInicio.getMinute());
        System.out.println("Comienza la cuenta de tu tiempo en pantalla.\nTe recordaremos cuando sea hora de una pausa.");
        

    }

    public static void finalizarTiempo() { // hora y fecha de fin
        tFin = LocalDateTime.now();
        System.out.println(tFin.getHour() + ":" + tFin.getMinute());
    }

    public static void calcularPromedioDiario() {
        long tMinutos = tInicio.until(tFin, ChronoUnit.MINUTES);
        double tHoras = tMinutos / 60;
        tDiario = tMinutos;
        promediosDiarios.add(tDiario); 
        System.out.println("\n Su sesión duró " + tHoras + " horas (" + tMinutos + " minutos)");
    }

    public static void calcularPromedioSemanal() {
        // calcular suma de tDiarios por semana
    }

    public String enviarAServidor() {
        // enviar datos del usuario, lista sesiones y lista promediosDiarios
        return "";
    }

    @Override
    public String enviarAPersistencia() {
        String sesionesTexto = "";
        String promediosDiariosTexto = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (LocalDateTime sesion : sesiones) {
            sesionesTexto += sesion.format(formatter) + "\n";
        }
        for (Long promedio : promediosDiarios) {
            promediosDiariosTexto += promedio + "\n";
        }
        return this.toString()+"\n"+"-SESIONES-\n"+sesionesTexto+"-PROMEDIOS DIARIOS-\n"+promediosDiariosTexto;
    }
}
