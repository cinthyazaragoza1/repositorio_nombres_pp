
package programas;

import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args){
        int n1,n2,suma;
        Scanner lectura=new Scanner(System.in);
        //entrada
        System.out.print("ingresar numero 1:");
        n1=lectura.nextInt();
        System.out.print("ingresar numero 2:");
        n2=lectura.nextInt();
        //proceso
        suma=n1+n2;
        //salida
                System.out.println("la suma es:"+suma);
    }
}
