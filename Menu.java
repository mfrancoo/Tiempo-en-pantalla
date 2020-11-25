import java.util.Scanner;

public class Menu extends Procesamiento {

  public static Usuario usuario;

  public static void menuInicio() {
    Scanner scan = new Scanner(System.in);
    System.out.println("\nBienvenido, por favor ingrese los datos solicitados\n");
    System.out.println("Nombre:");
    String nombre = scan.next();
    System.out.println("Ocupacion:");
    String ocupacion = scan.next();
    System.out.println("Meta de uso (horas)");
    int metaUso = scan.nextInt();
    usuario = new Usuario(nombre, ocupacion, metaUso);

    Procesamiento.iniciarTiempo();
  }

  public static void generarBarras(String tipo) {
    if (tipo.equals("diario")) {
      System.out.println("\nUso diario");
      for (int i = 8; i > 0; i--) {
        if (Procesamiento.promediosDiarios.get(promediosDiarios.size() - 1) / 60 >= i) {
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
