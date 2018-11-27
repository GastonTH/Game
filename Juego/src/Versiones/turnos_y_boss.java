package Versiones;

import java.util.Random;
import java.util.Scanner;

public class turnos_y_boss {

	public static void main(String[] args) {

		//TODO hacer los bosses
		
		Scanner sc=new Scanner(System.in);
		
        Random rnd=new Random();
		
		String pj 	= "Kuro";
		String boss = "Calamardo";
		String eleccion;
		
		int atkOP=20;
		int atkPj=atkOP;
		
		int vitPJ = 300;
		
		int atkOB = 10;
		int atkBoss=atkOB;
		int vitBoss = 300;
		/*vector de boss para eleccion*/
		/*int numero = (int) (Math.random() * 2) + 0;*/
		int numero;
		numero=rnd.nextInt(100);
		
		
		
		do {
			
			do {
				
				//turno del personaje
				
				System.out.println("Boss: "+boss
								 + " Vit:  "+vitBoss);
				
				System.out.println("Que quieres hacer:"
						+ " - Ataque."
						+ " - Defender.");
				eleccion=sc.nextLine();
				eleccion=eleccion.toLowerCase();

				if (eleccion.equals("atacar")) {
					
					System.out.println("Atacas al boss");
					System.out.println("");
					
					vitBoss-=atkPj;
					break;

				}else {
					
					if (eleccion.equals("defender")){
						
						atkBoss/=2;
						break;
						
					
					}else {
						
						System.out.println("Te has equivocado");
						
						
					}

				}
					
				
			}while (true);
			
			//turno del boss
			
			System.out.println("\nTurno del boss");
			numero=rnd.nextInt(2);
			System.out.println(numero);
			
			if (numero==0/*ataque*/) {
				
			}else {
				
				if (numero==1/*defensa*/) {
					
					
				}else/*se ha dormido*/ {
					
					System.out.println("Se ha dormido");
					
				}
				
			}
			
			
			
			



		}while (!(vitBoss==0||vitPJ==0));
		
		
		if (vitBoss==0) {

			System.out.println("Has derrotado a "+ boss);

		}else {

			System.out.println("Te ha derrotado "+boss+" lo siento "+pj );

		}





	}

}
