package basic.thead.synchronization.demo;

import java.util.Scanner;

class Processor extends Thread {
	private boolean running = true;

	public void run() {
		while (running) {
			System.out.println("Synchonization demo...");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
	}
}


public class ThreadSyncDemo1 {
	public static void main(String[] args) {
		// MAIN THREAD
		Processor processor = new Processor();

		// CREATE NEW THREAD
		processor.start();

		System.out.println("Press Enter to stop..");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		processor.shutdown();
	}
}


