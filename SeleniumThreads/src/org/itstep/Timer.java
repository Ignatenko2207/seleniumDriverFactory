package org.itstep;

public class Timer {

	public static void waitSeconds(int sec){
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
