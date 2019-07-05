package ifpromedioalumno;
import java.util.Scanner;

public class IfPromedioAlumno {

   
    public static void main(String[] args) {
       Scanner entraDatos=new Scanner(System.in);
       
              int num1, num2, num3, promedio;
              
                System.out.println("ingrese un numero= ");
               num1=entraDatos.nextInt();
               System.out.println("ingrese un numero= ");
               num2=entraDatos.nextInt();
               System.out.println("ingrese un numero= ");
               num3=entraDatos.nextInt();
               
               promedio=(num1+num2+num3)/3;
               
               if(promedio>=7)
               {
                   System.out.println("Aprobado");
               }
               else
               {
                   System.out.println("No Aprobado");
               }    
               
    }
}