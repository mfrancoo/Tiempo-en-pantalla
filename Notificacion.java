import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Notificacion extends Usuario {

    private String tipoPausa1 = this.getNombre() + ", llevas media hora en pantalla, es momento de pararse, estirar y darse un respiro";

    public void mostrarPausa() {
        for (int i = 0; i < (this.getMetaUso() * 60); i += 30) {
            LocalDateTime tpausa = Procesamiento.tInicio.plus(i, ChronoUnit.MINUTES);
            if (Procesamiento.tInicio.isEqual(tpausa)) {
                System.out.println(tipoPausa1);
            }
        }
    }
}
