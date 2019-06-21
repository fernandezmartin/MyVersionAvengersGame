package game;

import java.util.HashMap;

/**
 * 
 * @author Agustin Bulzomi
 * @version 0.1
 * This class is meant to be use to create objects that are specifications of StaticSemaphore.
 * It extends from @see StaticSemaphore
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
			try {
				StaticSemaphore.validString.acquire();
				
				StaticSemaphore.mutex.acquire();
				Weapon ToUse=super.getWeapon(StaticSemaphore.nameOfWeaponChoosedByUser);
				if (ToUse != null) {
					value=ToUse.causeHarm();
				}
				StaticSemaphore.nameOfWeaponChoosedByUser="";
				StaticSemaphore.usedString.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				StaticSemaphore.mutex.release();
			}
			
			return value;
		}

		@Override
		public int defendYourself() {
			int value=0;
			try {
				StaticSemaphore.validString.acquire();
				
				StaticSemaphore.mutex.acquire();
				Weapon ToUse=super.getWeapon(StaticSemaphore.nameOfWeaponChoosedByUser);
				if (ToUse != null) {
					value=ToUse.defend();
					
				}
				
				StaticSemaphore.nameOfWeaponChoosedByUser="";
				StaticSemaphore.usedString.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				StaticSemaphore.mutex.release();
			}
			
			return value;
		}




		
		@Override
		public String toString() {
		
		return super.toString();
		}
		
		@Override
		public boolean equals(Object obj) {
			boolean isEqual=false;
			if (obj != null && obj instanceof Hero) {
				isEqual=true;
			}
			return super.equals(obj)&&isEqual;
		}
		
		
}
