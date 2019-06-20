package game;

import java.util.HashMap;

/**
 * 
 * @author Agustin Bulzomi
 * @version 0.1
 * This class is meant to be use to create objects that are specifications of Character.
 * It extends from @see Character
 *
 */
public class Hero extends Character {
		
	
	
	
	
	
	
		public Hero() {
			super();
		}
		
		public Hero(String namePased, int lifepased, HashMap<String, Weapon> weaponsPassed) {
			super(namePased,lifepased, weaponsPassed);
		}

		@Override
		public int atack() {
			int value=0;
			while (Character.nameOfWeaponChoosedByUser=="");
			Weapon ToUse=super.getWeapon(Character.nameOfWeaponChoosedByUser);
			if (ToUse != null) {
				value=ToUse.defend();
			}
			Character.nameOfWeaponChoosedByUser="";
			return value;
		}

		@Override
		public int defendYourself() {
			int value=0;
			while (Character.nameOfWeaponChoosedByUser=="");
			Weapon ToUse=super.getWeapon(Character.nameOfWeaponChoosedByUser);
			if (ToUse != null) {
				value=ToUse.defend();
			}
			Character.nameOfWeaponChoosedByUser="";
			return value;
		}

		@Override
		public void getAtacked(int damageRecieved) {
			super.setLife(super.getLife()-(damageRecieved-defendYourself()));
			
		}

		@Override
		public int lifeLeft() {
			// TODO Auto-generated method stub
			return getLife();
		}
}
