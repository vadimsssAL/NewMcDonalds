package com.McDonaldsVadim.McDonalds;

import java.util.concurrent.Semaphore;

public class McDonalds extends Thread {

	private String name;
	private Semaphore semaphore;
	volatile private int r;

	public McDonalds(String name, Semaphore semaphore) {
		this.name = name;
		this.semaphore = semaphore;
		new Thread(this).start();
	}

	@Override
	public void run() {
		synchronized (this) {
			System.out.println(name + " - went to the checkout");
			try {
				semaphore.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			r = (int) (Math.random() * 100);
			semaphore.release();
			if (r > 50) {
				System.out.println(name + " - chance of a successful purchase " + r + "% which is more than 50%");
				System.out.println("End - " + name);			
			} else {
				System.out.println("Close - " + name);				
			}
				return;			
		}
	}
}
