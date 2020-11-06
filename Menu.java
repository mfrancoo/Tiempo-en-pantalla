import java.util.Scanner;
public class Menu{
    public void mostrarMenu(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Bienvenido al programa,por favor ingrese los datos solicitados");
      System.out.println("Nombre");
      String n= scan.next();
      System.out.println("Ocupación");
      String o= scan.next();
      System.out.println("Meta de uso");
      int m=scan.nextInt();
      Usuario u = new Usuario(n,o,m);
    }
    Public void generarBarras(){
    
    }

}
