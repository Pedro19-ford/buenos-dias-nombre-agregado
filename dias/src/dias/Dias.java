// programa el cual solicitara al usuario ingresar su nombre 
//y le mostrara un mensaje de buenos dias +nombre ingresado
package dias;
import java.util.Scanner;
public class Dias {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String cadena;
System.out.println("Introduce un nombre: ");
cadena = sc.nextLine();System.out.println("Buenos Días " + cadena);
}
}
