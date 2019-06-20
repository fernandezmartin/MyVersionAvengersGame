package game;

import java.util.HashMap;
import java.util.Random;

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
	
	public Villain(String namePased, int lifePased, HashMap<String, Weapon> weaponsPassed,int ambitionPased) {
		super(namePased, lifePased, weaponsPassed);
		setAmbition(ambitionPased);
	}

	@Override
	public int atack() {
		int value=0;
		String []keys=super.getWeaponsKeys();
		if (keys.length >0) {
			String keySelected=keys[new Random().nextInt(keys.length)];
			Weapon ToUse=super.getWeapon(keySelected);
			value=ToUse.causeHarm();
		}
		
		return value;
	}

	@Override
	public int defendYourself() {
		int value=0;
		String []keys=super.getWeaponsKeys();
		if (keys.length >0) {
			String keySelected=keys[new Random().nextInt(keys.length)];
			Weapon ToUse=super.getWeapon(keySelected);
			value=ToUse.defend();
		}
		
		return value;
	}

	@Override
	public void getAtacked(int damageRecieved) {
		super.setLife(getLife()-(damageRecieved-defendYourself()));
		
	}

	@Override
	public int lifeLeft() {
		// TODO Auto-generated method stub
		return super.getLife();
	}
}
