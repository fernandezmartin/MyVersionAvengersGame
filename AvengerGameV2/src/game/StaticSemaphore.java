package game;

import java.util.concurrent.Semaphore;

public class StaticSemaphore {
	public static String nameOfWeaponChoosedByUser;
	public static Semaphore mutex;
	public static Semaphore validString;
	public static Semaphore usedString;
	public static String choosed;
	public static Thread t1;
}
