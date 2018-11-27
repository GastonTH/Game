package Versiones;

import java.util.Scanner;

public class creacion_del_personaje {
	
	public static void limpiar (/* para hacer un clear en pantalla */){
		
	 for (int i=0; i <= 30; i++){

	  System.out.println(" ");
	  
	  }
	 
	}

	public static void contrato () {
		
		String nombre   = "Kuro";
		String sexo     = "hombre";
		String clase    = "guerrero";
		String arma     = "espada espiritual";
		String armadura = "placas";
		
		System.out.println  ("|------------------------------------------");
		System.out.println  ("|          CONTRATO DE AVENTURERO");
		System.out.println  ("|");
		System.out.printf   ("|Nombre: %s\n",nombre);
		System.out.println  ("|");
		System.out.printf   ("|Sexo: %s\n", sexo);
		System.out.println  ("|");
		System.out.printf   ("|Clase: %s\n",clase);
		System.out.println  ("|");
		System.out.printf   ("|Arma actual: %s\n",arma);
		System.out.println  ("|");
		System.out.printf   ("|Armadura actual: %s\n",armadura);
		System.out.println  ("|------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		/*Declaracion de variables del personaje*/
		
		
		String sexo;/*chico o chica*/
		String clase;/*Actualmente guerrero, mago o arquero*/
		
		String nombrePrincipal;
		
		int ataqueInicial=100;
		int ataque=ataqueInicial;
		int vitalidadInicial=155;
		int vitalidad=vitalidadInicial;
		
		/*Inventario*/
		
		String arma;
		String armadura;
		
		/*Cuando haya daños decimales recordad hacer casting a ¡int!*/
		
		//TODO Mirar como hacer la defensa del personaje
		
		int defensaInicial;
		int defensa;
		//
		/*Prueba para una futura tienda*/ int oro = 500;
		//
		/*contador para turno de jugador*/int contador;
		
		/* ------------------------------------ */
		
		/*CONTRATO*/ contrato();
		
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
					+ "El arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves increiblemente fuerte pero sacrificas tu velocidad,"
					+ "pero te da igual.");
			contador=14;
			arma="Espada espiritual";
			armadura="Placas";
			
		}else if (clase.equals("arquero")||(clase.equals("arquera"))) {
			
			System.out.println("Elegiste ser un arquero, se te otorgara un arco espiritual y"
					+ "una armadura de cuero."
					+ "El arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves mas rapido que nadie.");
			contador=6;
			arma="Arco espiritual";
			armadura="Cuero";

		}else if (clase.equals("mago")||(clase.equals("maga"))) {
			
			System.out.println("Elegiste ser un mago, se te otorgara un baston espiritual"
					+ "y una armadura de tela basica pero resistente."
					+ "El arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves mas rapido y mas fuerte.");
			contador=8;
			arma="Baston espiritual";
			armadura="Tela";
			
		}
		
		System.out.println("ola");


	}

}
