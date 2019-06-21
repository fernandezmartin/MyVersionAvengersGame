package game;

import javax.swing.plaf.SliderUI;

/**
 * 
 * @author Agustin Bulzomi
 * This class is meat to be used for making two objecto fight to death.
 *
 * @param <T> Whatever implments icombat
 * @param <K> Whatever implments icombat
 */
public class Battle <T extends  Icombat, K extends Icombat> {
	
	

	public Battle() {
		super();
	}
	
	public String fightToDeath(T playerOne, K playerTwo ) {
		
		String winner="";
		while(playerOne.lifeLeft()>0 && playerTwo.lifeLeft()>0) {
			OneAtackEach(playerOne, playerTwo);
			System.out.println("Player1: "+playerOne.lifeLeft());
			System.out.println("Player2: "+playerTwo.lifeLeft());
		
		}
		
		if (playerOne.lifeLeft()<=0&&playerTwo.lifeLeft()<=0) {
			winner="tie";
		}else {
			if (playerOne.lifeLeft()<=0) {
				winner="jugador2";
			}else {
				winner="jugador1";
			}
				
		}
		
		
		return winner;
	}
	
	private void OneAtackEach(T playerOne, K playerTwo ) {
		playerTwo.getAtacked(playerOne.atack());
		playerOne.getAtacked(playerTwo.atack());
		
	}

}
