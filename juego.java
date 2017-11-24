
import java.util.Scanner;


public class juego {
    
        public static void main(String[] args) {
            int sacar = 0;
            System.out.println("¿Que quieres sacar?");
            System.out.println( "Pulsa 1 para Tijeras");
            System.out.println( "Pulsa 2 para Piedra");
            System.out.println( "Pulsa 3 para Pepel");
            System.out.println( "Pulsa 4 para Salir");
            Scanner sc = new Scanner(System.in);
            sacar = sc.nextInt();
            switch(sacar) {
            case 1: 
                System.out.println("Tijera");
                break;
            case 2:
                System.out.println("Piedra");
                break;
            case 3:
                System.out.println("Papel");
                break;
            case 4:
                System.out.println("Hasta pronto");
                break;
            default:
                break;
            }
            sc.close();
        }
      }
    
    