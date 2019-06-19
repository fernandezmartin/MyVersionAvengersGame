package game;
/**
 * 
 * @author Agustin Bulzomi
 * @version 0.1
 * This class is meant to be use to create objects that are specifications of Character.
 * It extends from @see Character
 *
 */
public class Villain extends Character{
	private int ambition;

	private int getAmbition() {
		return ambition;
	}

	private void setAmbition(int ambition) {
		this.ambition = ambition;
	}
	
	
	public Villain() {
		super();
		setAmbition(0);
	}
	
	public Villain(String namePased, int lifePased, int ambitionPased) {
		super(namePased, lifePased);
		setAmbition(ambitionPased);
	}
}
