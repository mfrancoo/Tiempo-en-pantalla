public class Notificacion extends Usuario{
    
    private String tipoPausa1 = this.getNombre()+", llevas media hora en pantalla, es momento de pararse, estirar y darse un respiro";
    private String tipoPausa2 = this.getNombre()+", llevas una hora en pantalla, es momento de pararse, estirar y darse un respiro" ;

    public String mostrarPausa(){
        if(Procesamiento.tInicio ==1 ){
            return tipoPausa1;
        }else if(1==1){
            return tipoPausa2;
        }
    }
}
