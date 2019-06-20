package game;

import java.util.Random;

/**
 * 
 * @author Agustin Bulzomi
 * @version 0.1
 * This class is meabt to be used by @see Character to fight, using it to causeHarm and
 * DefendeThirSelves; its has a random indise to produce a value which is meant to be the harmcause by the object 
 * or the defense capacity in that moment, this random is kliomited by the weapons max and min value for each action
 *
 */
public class Weapon {
		
	private String nameOfWeapon;
	private int minimunDefenceCapacity;
	private int maxiumDenfenceCapacity;
	private int minimunDamage;
	private int maxiumDamage;
	private Random value;
	
	private String getNameOfWeapon() {
		return nameOfWeapon;
	}
	private void setNameOfWeapon(String nameOfWeapon) {
		this.nameOfWeapon = nameOfWeapon;
	}
	private int getMinimunDefenceCapacity() {
		return minimunDefenceCapacity;
	}
	private void setMinimunDefenceCapacity(int minimunDefenceCapacity) {
		this.minimunDefenceCapacity = minimunDefenceCapacity;
	}
	private int getMaxiumDenfenceCapacity() {
		return maxiumDenfenceCapacity;
	}
	private void setMaxiumDenfenceCapacity(int maxiumDenfenceCapacity) {
		this.maxiumDenfenceCapacity = maxiumDenfenceCapacity;
	}
	private int getMinimunDamage() {
		return minimunDamage;
	}
	private void setMinimunDamage(int minimunDamage) {
		this.minimunDamage = minimunDamage;
	}
	private int getMaxiumDamage() {
		return maxiumDamage;
	}
	private void setMaxiumDamage(int maxiumDamage) {
		this.maxiumDamage = maxiumDamage;
	}
	
	
	private Random getValue() {
		return value;
	}
	private void setValue(Random value) {
		this.value = value;
	}
	public Weapon() {
		super();
		setNameOfWeapon("");
		setMaxiumDamage(100);
		setMinimunDamage(2);
		setMaxiumDenfenceCapacity(90);
		setMinimunDefenceCapacity(1);
		setValue(new Random());
	}
	
	
	public Weapon(String namePased, int maxDam, int minDam, int maxDef, int minDef) {
		super();
		setNameOfWeapon(namePased);
		setMaxiumDamage(maxDam);
		setMinimunDamage(minDam);
		setMaxiumDenfenceCapacity(maxDef);
		setMinimunDefenceCapacity(minDef);
		setValue(new Random());
	}
	
	
}
