import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido al juego PiedraPApelTijera desarollado por 1ºDAM Bitch");
		System.out.println("Selecciona tu jugada");

		Scanner scanner = new Scanner(System.in);
		int jugada;
		int jugadabot;
		do {
			do {
				System.out.println("Introduce 1 para piedra");
				System.out.println("Introduce 2 para papel");
				System.out.println("Introduce 3 para tijera");
				jugada = scanner.nextInt();

			} while (!(jugada <= 3 && jugada >= 1));

			jugadabot = (int) (Math.random() * 3) + 1;

			if (jugada == jugadabot) {
				System.out.println("Empate");

				if(jugada==1) {System.out.println("Los dos sacaron piedra");}
				if(jugada==2) {System.out.println("Los dos sacron papel");}
				if(jugada==3) {System.out.println("Los dos sacaros tijera");}
				
				
			} else if (jugada > jugadabot) {
				if (jugada == 2) {
					System.out.println("Gana el suario");
					System.out.println("El usuario ha sacado papel y la quina piedra");

				}
				if (jugada == 3) {
					if (jugadabot == 1) {
						System.out.println("Gana la maquina");
						System.out.println("El usuario ha sacado tijera y la maquina piedra");
					}
					if (jugadabot == 2) {
						System.out.println("Gana el usuario");
						System.out.println("El usuario ha sacado tijera y la maquina papel");
					} else if (jugadabot > jugada) {
						if (jugadabot == 2) {
							System.out.println("Gana la maquina");
							System.out.println("El usuario ha sacado piedra y la maquina papel");
						}
						if (jugadabot == 3) {
							if (jugada == 1) {
								System.out.println("Gana el usuario");
								System.out.println("El usuario ha sacado piedra y la maquina tijera");
							}
							if (jugada == 2) {
								System.out.println("Gana la maquina");
								System.out.println("El usuario ha sacado papel y la maquina tijera");
							}
						}
					}
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} while (jugada < 100);
		scanner.close();
	}

}