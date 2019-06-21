package game;

import java.util.Scanner;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		Scanner scan=new Scanner(System.in);
		while (true) {
			try {
				
				StaticSemaphore.usedString.acquire();
				StaticSemaphore.mutex.acquire();
				StaticSemaphore.nameOfWeaponChoosedByUser=scan.next();
				StaticSemaphore.validString.release();
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				StaticSemaphore.mutex.release();
			}
			
		}
		
	}
	

}
