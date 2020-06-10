package packVehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Volem fer un software per un taller de vehicles,  * que en aquest moment té motos i cotxes. 
 * Els cotxes sempre tindran quatre rodes i les motos dues. 
 * 
 * FASE 3:
 * Modifica el projecte anterior afegint els mètodes necessaris a Bike, de manera que es pugui afegir rodes davanteres i traseres.
 * Modificar el Main anterior, afegint la opció de Bike o Car:
 * 0) Preguntar a l’usuari si vol crear un cotxe o una moto.
 * 1) Demanar a l’usuari la matrícula, la marca i el seu color.
 * 2) Crear el vehícle amb les dades anteriors.
 * 3) Afegir-li les rodes traseres corresponents, demanant a l’usuari la marca i el diametre.
 * 4) Afegir-li les rodes davanteres corresponents, demanant a l’usuari la marca i el diametre. 
 * 
 * @author Enric Comes
 *
 */
public class Fase3 {

	public static void main(String[] args) throws Exception {
		

		Scanner entrada = new Scanner(System.in);
		
		String matricula, marca, color, marcaRoda, tipusVehicle;
		double diametreRoda;
		
		//Pregunta si vol crear un cotxe o una moto
		System.out.println("Vols crear un cotxe o una moto?");
		tipusVehicle = entrada.nextLine().toLowerCase();
		
		//Demanar matricula, marca i color del cotxe o moto a l'usuari
		if(tipusVehicle.equals("cotxe")) {
			System.out.println("Escriu la matrícula del cotxe: ");
		}else if(tipusVehicle.contentEquals("moto")) {
			System.out.println("Escriu la matrícula de la moto: ");
		}
		matricula = entrada.nextLine();		
		if(tipusVehicle.equals("cotxe")) {
			System.out.println("Escriu la marca del cotxe: ");
		}else if(tipusVehicle.contentEquals("moto")) {
			System.out.println("Escriu la marca de la moto: ");
		}
		marca = entrada.nextLine();
		if(tipusVehicle.equals("cotxe")) {
			System.out.println("Escriu el color del cotxe: ");
		}else if(tipusVehicle.contentEquals("moto")) {
			System.out.println("Escriu el color de la moto: ");
		}
		color = entrada.nextLine();
		
		//Comprovar que la matrícula té 4 números i 2 o 3 lletres
		if(matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{2}$") || matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			System.out.println("Matrícula vàlida.");
			
			//Si és un cotxe, segueix aquest codi
			if(tipusVehicle.equals("cotxe")) {
				
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
				
			
			//Si no és un cotxe, sinó una moto, segueix aquest altre codi	
			}else if(tipusVehicle.contentEquals("moto")) {
				
				//Crear el cotxe amb les dades
				Bike moto1 = new Bike(matricula, marca, color);
				
				//Demanar marca i diametre de la roda trasera
				System.out.println("Escriu la marca de la roda trasera: ");
				marcaRoda = entrada.nextLine();
				System.out.println("Escriu el diametre de la roda trasera: ");
				diametreRoda = entrada.nextDouble();
				entrada.nextLine();
				
				//Comprovar que el diametre de la roda trasera sigui major a 0.4 i menor a 4
				if(diametreRoda > 0.4 && diametreRoda < 4) {
					System.out.println("Diametre de la roda trasera vàlid.");
					
					//Instanciar roda trasera
					Wheel rodaTrasera = new Wheel(marcaRoda, diametreRoda);
					
					//Demanar marca i diametre de la roda davantera
					System.out.println("Escriu la marca de la roda davantera: ");
					marcaRoda = entrada.nextLine();
					System.out.println("Escriu el diametre de la roda davantera: ");
					diametreRoda = entrada.nextDouble();
					entrada.nextLine();
					
					//Comprovar que el diametre de la roda davantera sigui major a 0.4 i menor a 4
					if(diametreRoda > 0.4 && diametreRoda < 4) {
						System.out.println("Diametre de la roda davantera vàlid.");
						
						//Instanciar roda davantera
						Wheel rodaDavantera = new Wheel(marcaRoda, diametreRoda);
						
						//Afegir les rodes al cotxe
						moto1.afegirRodes(rodaDavantera, rodaTrasera);
						
					}else {
						System.out.println("Diametre de les rodes davanteres no vàlid.");
					}
					
				}else {
					System.out.println("Diametre de les rodes traseres no vàlid.");
				}
				
			}
		
		}else {
			System.out.println("Matrícula no vàlida.");
		}	
		
	}

}
