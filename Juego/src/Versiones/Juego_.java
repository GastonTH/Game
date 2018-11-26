package Versiones;

import java.util.Scanner;

public class Juego_ {

	public static void mensajeBienvenida () {

		System.out.println(" d888b  d888888b db   db d8888b. d88888b db    db d88888b db       .d88b.  d8888b. d88888b d8888b. \r\n" + 
				"88' Y8b `~~88~~' 88   88 88  `8D 88'     88    88 88'     88      .8P  Y8. 88  `8D 88'     88  `8D \r\n" + 
				"88         88    88ooo88 88   88 88ooooo Y8    8P 88ooooo 88      88    88 88oodD' 88ooooo 88oobY' \r\n" + 
				"88  ooo    88    88~~~88 88   88 88~~~~~ `8b  d8' 88~~~~~ 88      88    88 88~~~   88~~~~~ 88`8b   \r\n" + 
				"88. ~8~    88    88   88 88  .8D 88.      `8bd8'  88.     88booo. `8b  d8' 88      88.     88 `88. \r\n" + 
				" Y888P     YP    YP   YP Y8888D' Y88888P    YP    Y88888P Y88888P  `Y88P'  88      Y88888P 88   YD \r\n" + 
				"                                                                                                   \r\n" + 
				"                                                                                                   ");

		System.out.println("");	
		System.out.println("                    Gracias por jugar mi juego, es solo el inicio de algo grande...");
		System.out.println("");

	}

	public static void menuEntrada () {

		System.out.println("----------------------------------------------------------------");
		System.out.println("|      |  Start  |        | Personaje |       | Historia |      |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("|                   Opciones  |  Exit                           |");
		System.out.println("----------------------------------------------------------------");
	}

	public static void opciones () {

		System.out.println("----------------------------------------------------------------");
		System.out.println("|                        Secret | Back                          |");
		System.out.println("----------------------------------------------------------------");


	}

	public static void personajes (String op) {

		if (op.equals("mujer")) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("| Eres un guerrera de la mas baja clase social, pero             |");
			System.out.println("| desde el dia en el que te nombraron caballero marco el punto de|");
			System.out.println("| partida de tu gran aventura...                                 |");
			System.out.println("| ¡Mucha suerte heroe!                                           |");
			System.out.println("-----------------------------------------------------------------");
		}else {
			if (op.equals("hombre")) {

				System.out.println("-----------------------------------------------------------------");
				System.out.println("| Eres un guerrero de la mas baja clase social, pero             |");
				System.out.println("| desde el dia en el que te nombraron caballero marco el punto de|");
				System.out.println("| partida de tu gran aventura...                                 |");
				System.out.println("| ¡Mucha suerte heroe!                                           |");
				System.out.println("-----------------------------------------------------------------");
			}
			else {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("| Eso no exoste en mi dimension, OPCION INCORRECTA.    		     |");
				System.out.println("| Prueba otra vez:                                               |");
				System.out.println("-----------------------------------------------------------------");
			}
		}
	}

	public static void preguntas () {

		int p1;
		int p2;
		int p3;

		Scanner sc = new Scanner (System.in);

		String eleccion = "";

		do {

			System.out.println("Dime el numero.");
			System.out.println("");
			System.out.println("Que te asusta mas:");
			System.out.println("1.Envejecer?");
			System.out.println("2.Ser diferente?");
			System.out.println("3.Ser indeciso?");
			p1=sc.nextInt();
			System.out.println("Que es mas importante:");
			System.out.println("4.Ser el numero uno.");
			System.out.println("5.La amistad?");
			System.out.println("6.Mis posesiones valiosas.");
			p2=sc.nextInt();
			System.out.println("Que quieres en la vida:");
			System.out.println("7.Ver lo que nadie a visto.");
			System.out.println("8.Ser como todo el mundo.");
			System.out.println("9.Ser fuerte.");
			p3=sc.nextInt();


			eleccion = p1 + "" + p2 + "" + p3;

			if (eleccion.equals("147")||(eleccion.equals("157"))||(eleccion.equals("148"))||(eleccion.equals("149"))||(eleccion.equals("167"))||(eleccion.equals("247"))||(eleccion.equals("347"))) {

				System.out.println("1");


			}else {
				//normal
				if (eleccion.equals("257")||(eleccion.equals("357"))||(eleccion.equals("158"))||(eleccion.equals("159"))||(eleccion.equals("168"))||(eleccion.equals("249"))||(eleccion.equals("258"))||(eleccion.equals("259"))||(eleccion.equals("268"))||(eleccion.equals("348"))||(eleccion.equals("358"))) {

					System.out.println("2");

				} else {
					//mas lento
					if (eleccion.equals("267")||eleccion.equals("367")||eleccion.equals("368")||eleccion.equals("169")||eleccion.equals("269")||eleccion.equals("349")||eleccion.equals("359")||eleccion.equals("369")) {

						System.out.println("3");				

					} else {

						eleccion="000";
						System.out.println("Vuelve a intentarlo");
					}
				}



			}

		}while ((eleccion.equals("000")));

	}

	//START TO THE GAME!

	public static void main(String[] args) {

		/* - Declaracion de variables - */

		/*entrada*/Scanner sc = new Scanner(System.in);

		String opm; 
		
		/* - Bienvenida GTHDeveloper - */
		mensajeBienvenida();

		do {
			
			menuEntrada();
			System.out.printf("Dime tu eleccion: ");
			/*Opcion menu minusculas*/
			opm=sc.nextLine();
			opm=opm.toLowerCase();
			/*----------------------*/
			System.out.println("");
			
			
			switch (opm) {
			case "opciones":

				do {
					
					/*Prueba de opciones a back*/
					
					opciones();
					
					System.out.printf("Dime tu eleccion: ");
					/*Opcion menu minusculas*/
					opm=sc.nextLine();
					opm=opm.toLowerCase();
					/*----------------------*/
					
				} while (!opm.equals("back"));
				
				break;

			default:
				break;
			}

		} while (!opm.equals("exit"));



		/* - cerrando teclado - */sc.close();
	}

}
