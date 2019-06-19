package game;
/**
 * 
 * @author Agustin Bulzomi
 * @version 0.1
 * This class is ment to be container for all villains and hero in the game.
 *
 */
public class Character {
		private String name;
		private int life;
		
		
		private String getName() {
			return name;
		}
		private void setName(String name) {
			this.name = name;
		}
		private int getLife() {
			return life;
		}
		private void setLife(int life) {
			this.life = life;
		}
		
		
		public Character() {
			setLife(0);
			setName("");
		}
		
		public Character(String namePassed, int lifePassed) {
			setLife(lifePassed);
			setName(namePassed);
		}
		
		
}
