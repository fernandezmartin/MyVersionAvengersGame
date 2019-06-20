package game;

public class Battle <T extends Icombat, K extends Icombat> {
	
	public Battle() {
		super();
	}
	
	public String fightToDeath(T playerOne, K playerTwo ) {
		String winner="";
		while(playerOne.lifeLeft()>0 && playerTwo.lifeLeft()>0) {
			
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
