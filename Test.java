import java.util.Scanner; 

public class TestPrograma1 {
 public static void main (String [ ] args) {
 System.out.println ("Empezamos el programa");
 System.out.println ("Por favor introduzca una cadena por teclado:");
 String entradaTeclado = "";
 Scanner entradaEscaner = new Scanner (System.in); 
 entradaTeclado = entradaEscaner.nextLine (); 
 System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
 } 
}