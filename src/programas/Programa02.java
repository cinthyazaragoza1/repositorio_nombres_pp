
package programas;
import java.util.Scanner;
public class Programa02 {
      public static void main(String[] args) {
        // TODO code application logic here
        String Datos_del_Empleado;
        
        double Ht,Th,Sb,D,Sn,B;
       
        // Entrada de datos
        Scanner lectura=new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        Datos_del_Empleado=lectura.next();
        System.out.print("Horas trabajadas: ");
        Ht=lectura.nextDouble();
        System.out.print("Tarifa por hora: ");
        Th=lectura.nextDouble();
        // Cálculos
        Sb=Ht*Th;
        D=Sb*0.13;
        B=Ht*0.1;
        Sn=Sb-D+B;
        
        // Resultados
        System.out.println("Sueldo Bruto:" + Sb);
        System.out.println("Descuento:" +D);
        System.out.println("Sueldo neto:" + Sn);
        System.out.println("Bono:" + B);
        
  }
    
}
