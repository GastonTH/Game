package Versiones;

import java.util.Scanner;

public class creacion_del_personaje {
	
	public static void limpiar (/* para hacer un clear en pantalla */){
		
	 for (int i=0; i <= 30; i++){

	  System.out.println(" ");
	  
	  }
	 
	}


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		/*Declaracion de variables del personaje*/
		
		
		String opper;
		String sexo;/*chico o chica*/
		String clase;/*Actualmente guerrero, mago o arquero*/
		
		String nombrePrincipal;
		
		int ataqueInicial=100;
		int ataque=ataqueInicial;
		int vitalidadInicial=155;
		int vitalidad=vitalidadInicial;
		
		/*Cuando haya daños decimales recordad hacer casting a ¡int!*/
		
		//TODO Mirar como hacer la defensa del personaje
		
		int defensaInicial;
		int defensa;
		//
		/*Prueba para una futura tienda*/ int oro = 500;
		//
		/*contador para turno de jugador*/int contador;
		
		/* ------------------------------------ */
		
		System.out.printf("Eres chico o chica: ");
		sexo=sc.nextLine();
		sexo=sexo.toLowerCase();
		System.out.println("");
		
		if (sexo.equals("chico")) {

			System.out.printf("Dime tu nombre aventurero: ");
			nombrePrincipal=sc.nextLine();
			
			
			/*TODO hacer algo de lore aqui*/System.out.println("");
			
			
			System.out.println("Muy bien " + nombrePrincipal + " dime que clase deseas ser:");
			
			System.out.printf("----------------------------------------------------------------------------"
					+ "\nClase guerrera, fuertes y duros pero un poco lentos."
					+ "\nClase exploradora, caracterizada por su velocidad."
					+ "\nClase magica, realmente fuertes pero debiles en combates extensos."
					+ "\n----------------------------------------------------------------------------"
					+ "\nAsi que dime aventurero, que quieres ser un guerrero, un mago"
					+ "\no un explorador."
					+ "\n----------------------------------------------------------------------------\n");
			
			clase=sc.nextLine();
			clase=clase.toLowerCase();
			
			limpiar();
			
		} else if (sexo.equals("chica")) {
				
				System.out.printf("Dime tu nombre aventurera: ");
				nombrePrincipal=sc.nextLine();
				
				
				/*TODO hacer algo de lore aqui*/System.out.println("");
				
				
				System.out.println("Muy bien " + nombrePrincipal + " dime que clase deseas ser:");
				
				System.out.printf("----------------------------------------------------------------------------"
						+ "\nClase guerrera, fuertes y duros pero un poco lentos."
						+ "\nClase exploradora, caracterizada por su velocidad."
						+ "\nClase magica, realmente fuertes pero debiles en combates extensos."
						+ "\n----------------------------------------------------------------------------"
						+ "\nAsi que dime aventurera, que quieres ser una guerrera, una maga"
						+ "\no una exploradora."
						+ "\n----------------------------------------------------------------------------\n");
				
			}
		/*Hasta aqui hemos creado el personaje sin clase*/
		

		clase=sc.nextLine();
		clase=clase.toLowerCase();

		/* - Clases + añadidos a sus estadisticas + inicializacion del contador - */
		
		if (clase.equals("guerrero")||clase.equals("guerrera")) {
			
			System.out.println("Elegiste ser un guerrero, se te otorgara una espada espiritual y una armadura de"
					+ "malla basica pero resistente."
					+ "La arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves increiblemente fuerte pero sacrificas tu velocidad,"
					+ "pero te da igual.");
			contador=14;
			
			
		}else if (clase.equals("arquero")||(clase.equals("arquera"))) {
			
			System.out.println("Elegiste ser un arquero, se te otorgara un arco espiritual y"
					+ "una armadura de cuero."
					+ "La arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves mas rapido que nadie.");
			contador=6;

		}else if (clase.equals("mago")||(clase.equals("maga"))) {
			
			System.out.println("Elegiste ser un mago, se te otorgara un baston espiritual"
					+ "y una armadura de tela basica pero resistente."
					+ "Te vuelves mas rapido y mas fuerte.");
			contador=8;
			
		}
		
		System.out.println("ola");


	}

}
