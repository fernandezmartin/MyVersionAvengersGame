package game;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 * 
 * @author Agustin Bulzomi
 * This is the main class, this class it's just for makeing the game start
 *
 */
public class Main {

	public static void main(String[] args) {
		StaticSemaphore.mutex=new Semaphore(1);
		StaticSemaphore.validString= new Semaphore(0);
		StaticSemaphore.usedString=new Semaphore(1);
		StaticSemaphore.nameOfWeaponChoosedByUser="";
		Character c1=Json.bringUpCharacter("Thanos");
		Character c2=Json.bringUpCharacter("Thor");
		HashMap<String, Weapon> armas=new HashMap<String, Weapon>() ;
		armas.put("Mjolnir", new Weapon ("Mjolnir",80,50,35,20));
		Character c3= new Hero("Thor", 10000,armas);
		Thread t1=new Thread(new Thread2());
		t1.start();
		Battle<Character, Character> game = new Battle<Character, Character>();
		System.out.println("It won: "+ game.fightToDeath(c1, c2));
	}

}
