import java.util.Scanner;
public class Salida{
	public static void main(String [] args){
		String EntradaTexto="";
		Scanner lee=new Scanner(System.in);
		System.out.println("Inice el texto");
		System.out.println("Ingrese el texto : ");
		EntradaTexto=lee.nextLine();
		System.out.println("El texto ingresado es :\n "+ EntradaTexto);
		Texto obj=new Texto(EntradaTexto);
		obj.ImprimirTexto();
	}
}