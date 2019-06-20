package game;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Agustin Bulzomi
 * @version 0.2
 * This class is ment to be container for all villains and hero in the game.
 *
 */
public abstract class  Character implements Icombat {
		private String name;
		private int life;
		private HashMap<String, Weapon> weapons;
		public static String nameOfWeaponChoosedByUser;
		
		
		
		private String getName() {
			return name;
		}
		private void setName(String name) {
			this.name = name;
		}
		protected int getLife() {
			return life;
		}
		protected void setLife(int life) {
			this.life = life;
		}
		
		
		
		private HashMap<String, Weapon> getWeapons() {
			return weapons;
		}
		private void setWeapons(HashMap<String, Weapon> weapons) {
			this.weapons = weapons;
		}
		
		
		

		
		public Character() {
			setLife(0);
			setName("");
			setWeapons(new HashMap<String, Weapon>());
			Character.nameOfWeaponChoosedByUser="";
		}
		
		public Character(String namePassed, int lifePassed,  HashMap<String, Weapon> weaponsPassed) {
			setLife(lifePassed);
			setName(namePassed);
			setWeapons(weaponsPassed);
			Character.nameOfWeaponChoosedByUser="";
			
		}
		
		protected Weapon getWeapon(String key) {
			return  getWeapons().get(key);
		}
		
		protected String [] getWeaponsKeys() {
			return  getWeapons().keySet().toArray(new String [getWeapons().keySet().size()]);
		}
		
		
		@Override
			public boolean equals(Object obj) {
				boolean isEqual=false;
				if (obj != null && obj instanceof Character) {
					Character temporay=(Character) obj;
					if (temporay.toString().equals(this.toString())) {
						isEqual=true;
					}
				}
				
				return isEqual;
			}
	
		@Override
			public String toString() {
				String strToReturn=getName();
				return strToReturn;
			}
}
