package es.iessoterhernandez.daw.endes.menu;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
   
       int opcion;
       Scanner sc = new Scanner(System.in);
      
      
      do {
          System.out.println("MENU DE OPCIONES");
          System.out.println("0- Salir");
          System.out.println("1- Saludo formal");
          System.out.println("Escoge una opcion");
          opcion = sc.nextInt();
          
           switch (opcion) {
               case 0: 
                   System.out.println("Saliendo...");
                   break;
              case 1:
                  System.out.println("hola señor");
                  break;
              default:
                  System.out.println("Opcion incorrecta");;
          }
       
        
        
           
        } while (opcion !=0 );
  }
}
