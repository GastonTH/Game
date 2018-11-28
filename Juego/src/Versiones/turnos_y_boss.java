package Versiones;

import java.util.Random;
import java.util.Scanner;

public class turnos_y_boss {
	
	public static int [][] matrizBosses (){
		
		String [][] matrizBosses=new String [][] {{"1","Ivan-samaneitor"},{"2","ElAdri"},{"3","ElDopeOCHO!"}};
		
		
		
		return matrizBosses();
		
	}
	
	public static void vidaMostrar (String caracter, String pj, String boss, int vidaBoss, int vidaPj) {
		
		System.out.println(pj+" = "+vidaPj);
		for (int i = 0; i < vidaPj/5; i++) {

			System.out.printf("%s",caracter);

		}
		System.out.printf("%n");

		
		System.out.println(boss + " = " + vidaBoss);
		for (int i = 0; i < vidaBoss/5; i++) {

			System.out.printf("%s",caracter);

		}
		System.out.printf("%n");

	
	}
	
	

	public static void main(String[] args) {

		//TODO hacer los bosses
		
		Scanner sc=new Scanner(System.in);
		
        Random rnd=new Random();
        
        String caracter = "=";
		
		String pj 	= "Kuro";
		String boss = "Bic";
		String eleccion;
		
		int ataqueOrigPers=20;
		int ataquePers=ataqueOrigPers;
		//
		int vitPJ = 300;
		
		int ataqueOrigBoss = 10;
		int ataqueBoss=ataqueOrigBoss;
		//
		int vitBoss = 300;

		/*int numero = (int) (Math.random() * 2) + 0;*/
		int numero;
		numero=rnd.nextInt(100);
		
		int contador=0;
		
		
		
		do {
			
			do {
				
				
				vidaMostrar(caracter,pj,boss,vitBoss,vitPJ);
				
				System.out.println("Que quieres hacer:"
						+ " - Ataque."
						+ " - Defender.");
				eleccion=sc.nextLine();
				eleccion=eleccion.toLowerCase();

				if (eleccion.equals("ataque")) {
					
					System.out.println("Atacas al boss");
					System.out.println("");
					
					vitBoss-=ataquePers;
					break;

				}else {
					
					if (eleccion.equals("defender")){
						
						ataqueBoss/=2;
						break;
						
					
					}else {
						
						System.out.println("Te has equivocado");
						
						
					}

				}
				
				ataquePers=ataqueOrigPers;
					
				
			}while (true);
			
			//turno del boss
			
			System.out.println("\nTurno del boss");
			numero=rnd.nextInt(2);
			System.out.println(numero);
			
			if (numero==0/*ataque*/) {
				
				vitPJ-=ataqueBoss;
				System.out.println("El ");
				
			}else {
				
				if (numero==234535/*defensa*/) {
					
					
				}else/*se ha dormido*/ {
					
					System.out.println("Se ha dormido");
					
				}
				
			}
			
			ataqueBoss=ataqueOrigBoss;
			
			
			
			



		}while (!(vitBoss==0||vitPJ==0));
		
		
		if (vitBoss==0) {

			System.out.println("Has derrotado a "+ boss);

		}else {

			System.out.println("Te ha derrotado "+boss+" lo siento "+pj );

		}





	}

}
