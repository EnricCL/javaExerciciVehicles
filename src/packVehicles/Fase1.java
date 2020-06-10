package packVehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Volem fer un software per un taller de vehicles,  * que en aquest moment té motos i cotxes. 
 * Els cotxes sempre tindran quatre rodes i les motos dues. 
 * 
 * FASE 1:
 * Ens donen un codi parcialment desenvolupat. El codi pot no estar complet i que s’hagi de modificar.
 * El podem descarregar d’aquest link: https://github.com/ITAcademyProjects/VehiclesProject
 * Ens demanen crear una classe Main que realitzi els següents passos: 
 * 1) Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.
 * 2) Crear el cotxe amb les dades anteriors.
 * 3) Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
 * 4) Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre. 
 * 
 * @author Enric Comes
 *
 */
public class Fase1 {


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
		
		//Crear el cotxe amb les dades
		Car cotxe1 = new Car(matricula, marca, color);
		
		//Demanar marca i diametre de les 2 rodes traseres
		System.out.println("Escriu la marca de les rodes traseres: ");
		marcaRoda = entrada.nextLine();
		System.out.println("Escriu el diametre de les rodes traseres: ");
		diametreRoda = entrada.nextDouble();
		entrada.nextLine();
		
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
		
		//Instanciar roda davantera, crear llistat i afegir dues rodes davanteres a la llista
		Wheel rodaDavantera = new Wheel(marcaRoda, diametreRoda);
		List<Wheel> rodesDavanteres = new ArrayList<Wheel>();
		rodesDavanteres.add(rodaDavantera);
		rodesDavanteres.add(rodaDavantera);
		
		//Afegir les rodes al cotxe
		cotxe1.addWheels(rodesDavanteres, rodesTraseres);
		
	}

}
