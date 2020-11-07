import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Notificacion extends Usuario{
    
    private String tipoPausa1 = this.getNombre()+", llevas media hora en pantalla, es momento de pararse, estirar y darse un respiro";
    private String tipoPausa2 = this.getNombre()+", llevas una hora en pantalla, es momento de pararse, estirar y darse un respiro" ;

    public void mostrarPausa(){
        if(){
        
        }else if(){
        
        }
    }

    public void experimento() {
        LocalDateTime tpausa = Procesamiento.tInicio.plus(30, ChronoUnit.MINUTES);
        if (Procesamiento.tInicio.isEqual(tpausa)) {
            
        }    
    }
}
