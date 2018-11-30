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
	
	public static void menuRPG () {
		System.out.println("||--------------Que quieres hacer----------------||");
		System.out.println("|| - Atacar - - Defender - - Magia - - Objetos - ||");		
		System.out.println("||----- --------/////////////////----------------||");
	}
	
	public static void menuObjetos () {
		
		System.out.println("||---------------Que quieres usar----------------||");

		System.out.println("||----- --------/////////////////----------------||");

		
	}
	
	public static void items () {
		
		String [][] listaItems = new String [4][2];
		
		listaItems[0][0] ="1";
		listaItems[0][1] ="Elixir de vida";
		listaItems[1][0] ="2";
		listaItems[1][1] ="Elixir de mana";
		listaItems[2][0] ="3";
		listaItems[2][1] ="Elixir de fuerza";
		listaItems[3][0] ="4";
		listaItems[3][1] ="Elixir de defensa";
		
		for (int i = 0; i < listaItems.length; i++) {
			
			for (int j = 0; j < listaItems[0].length; j++) {
				
				System.out.printf("%4s   ",listaItems[i][j]);
				
			}
			System.out.printf("%n");
		}
		
	}
	
	public static void inventarioPJ () {
		
		String [][] inventario = new String [5][2];
		
		inventario[0][0]="";//cantidad
		inventario[0][1]="";
		inventario[1][0]="";//cantidad
		inventario[1][1]="";
		inventario[2][0]="";//cantidad
		inventario[2][1]="";
		inventario[3][0]="";//cantidad
		inventario[3][1]="";
		inventario[4][0]="";//cantidad
		inventario[4][1]="";
		
	}

	public static void main(String[] args) {

		//TODO hacer los bosses
		
		Scanner sc=new Scanner(System.in);
		
        Random rnd=new Random();
        
        String caracter = "=";
		
		String pj 	= "Kuro";
		String boss = "Bic";
		String eleccion;
		
		/*Variables del personaje*/
		
		int ataqueOrigPers=20;
		int ataquePers=ataqueOrigPers;
		int defensaPJ = 10;/*al ataque se le rensta la defensa*/
		//
		int vitPJ = 300;
		int manaPJ;
		/*                       */
		
		/*Variables del boss*/
		
		int ataqueOrigBoss = 10;
		int ataqueBoss=ataqueOrigBoss;
		int defensaBoss = 30;/*al ataque se le rensta la defensa*/
		//
		int vitBoss = 300;
		int manaBoss;
		/*                        */

		/*int numero = (int) (Math.random() * 2) + 0;*/
		int numero;
		numero=rnd.nextInt(100);
		
		int contador=0;
		
		
		
		
		
		
		menuRPG();
		System.out.println("");
		
		menuObjetos();
		System.out.println("");
		
		items();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		do {
			
			do {
				
				
				vidaMostrar(caracter,pj,boss,vitBoss,vitPJ);
				
				menuRPG();
				
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
			
			if (numero==0) {
				
				vitPJ-=ataqueBoss;
				System.out.println("El boss a atacado.");
				
			}else {
				
				if (numero==234535) {
					
					System.out.println("El boss se defiende");
					
				}else {
					
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


*/


	}

}
