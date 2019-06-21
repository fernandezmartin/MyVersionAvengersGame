package game;

import java.util.Scanner;

public class Thread2 implements Runnable{
	
	public Thread2() {
		super();
	}

	@Override
	public void run() {
			String result= new String("");
			Battle<Character, Character> game = new Battle<Character, Character>();
			Character playerOne=Json.bringUpCharacter(StaticSemaphore.choosed);
			Character playerTwo=Json.bringUpCharacter("Thanos");
			result=game.fightToDeath(playerOne, playerTwo);
			PlayersFile.writeFile(result);
			
			
	}
		
}
	


