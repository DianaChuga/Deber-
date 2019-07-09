import java.util.Scanner;
public class PFecha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, a;
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("anio: ");
        a = sc.nextInt();
        Fecha fecha = new Fecha(d,m,a);	
	Fecha obj =new Fecha(d,m,a);
	obj.ImprimirDatos();
       
      }
}