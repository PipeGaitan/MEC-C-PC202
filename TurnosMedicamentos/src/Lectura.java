
import java.util.Scanner;


 class Lectura {
     private static Scanner ingresa= new Scanner(System.in);
     public static int nextInt(String mensaje){
         System.out.print(mensaje);
         int n= ingresa.nextInt();
         ingresa.nextLine();
         return n;     
     }
     public static String nextString(String mensaje){
         System.out.print(mensaje);
         return ingresa.nextLine();
     
     }
}
