import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Menu.menuInicio();

        Thread notificacion = new Thread(Notificacion.mostrarPausa);
        notificacion.start();

        Scanner scan = new Scanner(System.in);
        System.out.println("\n--- Presione x para detener el temporizador y ver sus graficas de uso ---\n");
        while (true) {
            String finalizar = scan.next();
            if (finalizar.toLowerCase().trim().equals("x")) {
                notificacion.interrupt();
                Procesamiento.finalizarTiempo();
                Procesamiento.calcularPromedioDiario();
                Menu.usuario.mostrarMetaUso();
                Menu.generarBarras("diario");
                Persistencia.escribirAFichero(Menu.usuario.enviarAPersistencia());
                break;
            }
        }
        scan.close();
    }
}