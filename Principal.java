import java.util.Scanner;
public class Principal{
	public static void main(String arg []){
	String Nom,Esp;
	int Ed;
	Scanner lee=new Scanner(System.in);
	System.out.println("Ingrese el Nombre: ");
	Nom=lee.next();
	System.out.println("Ingrese el Espacie: ");
	Esp=lee.next();
	System.out.println("Ingrese la Edad: ");
	Ed=lee.nextInt();
	Animales obj =new Animales(Nom,Esp,Ed);
	obj.ImprimirDatos();
	
	}
}