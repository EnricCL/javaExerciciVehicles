package packVehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Volem fer un software per un taller de vehicles,  * que en aquest moment té motos i cotxes. 
 * Els cotxes sempre tindran quatre rodes i les motos dues. 
 * 
 * FASE 2:
 * Millorar el codi anterior comprovant la informació necesaria alhora de crear els objectes. S’ha de tenir en compte:
 * - Una matrícula ha de tenir 4 números i dues o tres lletres.
 * - Un diametre de la roda ha de ser superior a 0.4 i inferior a 4 
 * 
 * @author Enric Comes
 *
 */
public class Fase2 {


public static void main(String[] args) throws Exception {
		
		Scanner entrada = new Scanner(System.in);
		
		String matricula, marca, color, marcaRoda;
		double diametreRoda;
		
		//Demanar matricula, marca i color del cotxe a l'usuari
		System.out.println("Escriu la matrícula del cotxe: ");
		matricula = entrada.nextLine();		
		System.out.println("Escriu la marca del cotxe: ");
		marca = entrada.nextLine();		
		System.out.println("Escriu el color del cotxe: ");
		color = entrada.nextLine();
		
		//Comprovar que la matrícula té 4 números i 2 o 3 lletres
		if(matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{2}$") || matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			System.out.println("Matrícula vàlida.");
			
			//Crear el cotxe amb les dades
			Car cotxe1 = new Car(matricula, marca, color);
			
			//Demanar marca i diametre de les 2 rodes traseres
			System.out.println("Escriu la marca de les rodes traseres: ");
			marcaRoda = entrada.nextLine();
			System.out.println("Escriu el diametre de les rodes traseres: ");
			diametreRoda = entrada.nextDouble();
			entrada.nextLine();
			
			//Comprovar que el diametre de les rodes traseres sigui major a 0.4 i menor a 4
			if(diametreRoda > 0.4 && diametreRoda < 4) {
				System.out.println("Diametre de les rodes traseres vàlid.");
				
				//Instanciar roda trasera, crear llistat i afegir dues rodes traseres a la llista
				Wheel rodaTrasera = new Wheel(marcaRoda, diametreRoda);
				List<Wheel> rodesTraseres = new ArrayList<Wheel>();
				rodesTraseres.add(rodaTrasera);
				rodesTraseres.add(rodaTrasera);
				
				//Demanar marca i diametre de les 2 rodes davanteres
				System.out.println("Escriu la marca de les rodes davanteres: ");
				marcaRoda = entrada.nextLine();
				System.out.println("Escriu el diametre de les rodes davanteres: ");
				diametreRoda = entrada.nextDouble();
				entrada.nextLine();
				
				//Comprovar que el diametre de les rodes davanteres sigui major a 0.4 i menor a 4
				if(diametreRoda > 0.4 && diametreRoda < 4) {
					System.out.println("Diametre de les rodes davanteres vàlid.");
					
					//Instanciar roda davantera, crear llistat i afegir dues rodes davanteres a la llista
					Wheel rodaDavantera = new Wheel(marcaRoda, diametreRoda);
					List<Wheel> rodesDavanteres = new ArrayList<Wheel>();
					rodesDavanteres.add(rodaDavantera);
					rodesDavanteres.add(rodaDavantera);
					
					//Afegir les rodes al cotxe
					cotxe1.addWheels(rodesDavanteres, rodesTraseres);
					
				}else {
					System.out.println("Diametre de les rodes davanteres no vàlid.");
				}
				
			}else {
				System.out.println("Diametre de les rodes traseres no vàlid.");
			}
			
		}else {
			System.out.println("Matrícula no vàlida.");
		}	
		
	}

}
