/**
 * 
 */
package com.concurency;

/**
 * @author abdare
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Task t1  = new Task("Thread : A");
		t1.start();
		t1.join();
		Task t2  = new Task("Thread : B");
		t2.start();

	}

}


class Task extends Thread{
	
	public Task(String name) {
		super.setName(name);
	}

	public void run(){
		
		for(int i=0; i<1000; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}
