import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Notificacion extends Usuario {

    public static String tipoPausa1 = Usuario.nombreCopia + ", llevas media hora en pantalla, es momento de pararse, estirar y darse un respiro";

    public static void mostrarPausa() {
        for (int i = 30; i < (Usuario.metaUsoCopia*60); i += 30) {
            LocalDateTime tpausa = Procesamiento.tInicio.plus(i, ChronoUnit.MINUTES);
            if (Procesamiento.tInicio.isEqual(tpausa)) {
                System.out.println(tipoPausa1);
            }
        }
    }
} 
