public class Notificacion extends Usuario {

    public static String tipoPausa1 = Usuario.nombreCopia + ", llevas media hora en pantalla, descansa un momento, parate y estira un poco\n";

    public static Runnable mostrarPausa = new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(60000 * 30); // Cada 30 minutos
                    System.out.println(tipoPausa1);
                } catch (InterruptedException e) {
                }
            }
        }
    };
}