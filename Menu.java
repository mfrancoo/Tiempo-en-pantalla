import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido, por favor ingrese los datos solicitados");
        System.out.println("Nombre:");
        String nombre = scan.next();
        System.out.println("Ocupación:");
        String ocupacion = scan.next();
        System.out.println("Meta de uso (horas)");
        int metaUso = scan.nextInt();
        Usuario usuario = new Usuario(nombre, ocupacin, metaUso);

        scan.close();
    }

    public void generarBarras() {

    }
}