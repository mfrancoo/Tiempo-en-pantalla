import java.util.Scanner;

public class Menu extends Procesamiento {

  public static void mostrarMenu() {

    Scanner scan = new Scanner(System.in);
    System.out.println("Bienvenido, por favor ingrese los datos solicitados");
    System.out.println("Nombre:");
    String nombre = scan.next();
    System.out.println("Ocupación:");
    String ocupacion = scan.next();
    System.out.println("Meta de uso (horas)");
    int metaUso = scan.nextInt();
    Usuario usuario = new Usuario(nombre, ocupacion, metaUso);

    while (true) {
      Procesamiento.iniciarTiempo();
      System.out.println("--- Presione x para detener el temporizador y ver sus graficas de uso ---");

      String finalizar = scan.next();
      Notificacion.mostrarPausa();
      if (finalizar.toLowerCase().trim() != "x") {
        Procesamiento.finalizarTiempo();
        Procesamiento.calcularPromedioDiario();
        usuario.mostrarMetaUso();
        generarBarras("diario");
        Persistencia.escribirAFichero(usuario.enviarAPersistencia());
        break;
      }
    }

    scan.close();
  }

  public static void generarBarras(String tipo) {
    if (tipo.equals("diario")) {
      System.out.println("\nUso diario");
      for (int i = 8; i > 0; i--) {
        if (Procesamiento.promediosDiarios.get(promediosDiarios.size() - 1)/60 >= i) {
          System.out.println("  " + i + "  |////|");
        } else {
          System.out.println("  " + i + "  |    |");
        }
      }
      System.out.println("  h   Uso\n");
    } else if (tipo.equals("semanal")) {
      //
    } else if (tipo.equals("mensual")) {
      //
    }
  }
}
