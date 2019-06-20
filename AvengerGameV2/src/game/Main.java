package game;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Agustin Bulzomi
 * This is the main class, this class it's just for makeing the game start
 *
 */
public class Main {

	public static void main(String[] args) {
		Battle<Villain, Villain> jugada=new Battle<Villain, Villain>();
		
		HashMap<String, Weapon> armas=new HashMap<String, Weapon>() ;
		armas.put("Mjolnir", new Weapon("Mjolnir", 80,50,35,20));
		armas.put("StormBreaker", new Weapon ("StormBreaker",100,50,40,10));
		armas.put("CapShield", new Weapon ("CapShield",40,30,30,10));
		Villain villano = new Villain("Thanos",10000,armas, 10 );
		Villain villano2 = new Villain("Marikena",10000,armas, 10 );
		
		System.out.println(jugada.fightToDeath(villano, villano2));
	}

}
