package game;

import java.util.Random;

public class Stone {
	private int minLimit;
	private int maxLimit;
	private Random value;
	private String stoneName;
	
	private int getMinLimit() {
		return minLimit;
	}
	private void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}
	private int getMaxLimit() {
		return maxLimit;
	}
	private void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}
	private Random getValue() {
		return value;
	}
	private void setValue(Random value) {
		this.value = value;
	}
	private String getStoneName() {
		return stoneName;
	}
	private void setStoneName(String stoneName) {
		this.stoneName = stoneName;
	}
	
	
	public Stone() {
		setMaxLimit(100);
		setMinLimit(1);
		setStoneName("");
		setValue(new Random());
	}
	
	public Stone (String stoneNamePassed, int maxium, int minimun) {
		setStoneName(stoneNamePassed);
		setMaxLimit(maxium);
		setMinLimit(minimun);
		setValue(new Random());
	}
	
	public int produceAtack() {
		int atackGenerated=0;
		atackGenerated=getValue().nextInt(getMaxLimit())+getMinLimit();
		return atackGenerated;
	}
	
	public int blockAtack() {
		int actackBlocked=0;
		actackBlocked=getValue().nextInt(getMaxLimit())+getMinLimit();
		return actackBlocked;
	}
	
	
}
