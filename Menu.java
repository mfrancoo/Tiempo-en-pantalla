import java.util.Scanner;

public class Menu extends Procesamiento{

  public void mostrarMenu() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Bienvenido, por favor ingrese los datos solicitados");
    System.out.println("Nombre:");
    String nombre = scan.next();
    System.out.println("Ocupación:");
    String ocupacion = scan.next();
    System.out.println("Meta de uso (horas)");
    int metaUso = scan.nextInt();
    Usuario usuario = new Usuario(nombre, ocupacion, metaUso);

    Procesamiento.iniciarTiempo();
    System.out.println("--- Presione x para detener el temporizador y ver sus graficas de uso ---");

    String finalizar = scan.next().toLowerCase().trim();
    if (finalizar == "x") {
      Procesamiento.finalizarTiempo();
      Procesamiento.calcularPromedioDiario();
      usuario.mostrarMetaUso();
    }

    scan.close();
  }

  public void generarBarras() {

  }
}