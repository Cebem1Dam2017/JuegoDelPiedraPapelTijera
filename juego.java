
public class juego {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int sacar = 0;
        int idioma = 0;

        System.out.println("¡Bien venido! // Welcome!");
        System.out.println("Elije tu idioma // Choose your language  ");
        System.out.println("1 - Español // Spanish\n 2 - Inglés // English");

        switch (idioma) {
            case 1:
                idioma = 1;
            case 2:
                idioma = 2;
        }


        if (idioma == 1) {
            System.out.println("¿Que quieres sacar?");
            System.out.println("Pulsa 1 para Tijeras");
            System.out.println("Pulsa 2 para Piedra");
            System.out.println("Pulsa 3 para Pepel");
            System.out.println("Pulsa 4 para Salir");

            sacar = sc.nextInt();
            switch (sacar) {
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
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    break;
            }
            if (idioma == 2) {
                System.out.println("¿Que quieres sacar?");
                System.out.println("Pulsa 1 para Tijeras");
                System.out.println("Pulsa 2 para Piedra");
                System.out.println("Pulsa 3 para Pepel");
                System.out.println("Pulsa 4 para Salir");

                sacar = sc.nextInt();
                switch (sacar) {
                    case 1:
                        System.out.println("Scissors");
                        break;
                    case 2:
                        System.out.println("Stone");
                        break;
                    case 3:
                        System.out.println("Paper");
                        break;
                    case 4:
                        System.out.println("See you soon!");
                        break;
                    default:
                        break;
                }
                sc.close();
            }
        }
    }
}
    
    