package org.itstep;

public class SeleniumThreadsRunner {

	public static void main(String[] args) {
		Thread thread1 = new ThreadSel1("https:\\www.google.com");
		thread1.start();
		Thread thread2 = new ThreadSel2("https:\\www.ukr.net");
		thread2.start();
		Thread thread3 = new ThreadSel3("https:\\www.amazon.com");
		thread3.start();
	}

}
