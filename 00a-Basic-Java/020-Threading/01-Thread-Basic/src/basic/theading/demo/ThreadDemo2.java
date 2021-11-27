package basic.theading.demo;

class Runner2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("TheadDemo Using Runnable:" + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


public class ThreadDemo2 {
	public static void main(String[] args) {
		Runner2 demoRunner = new Runner2();
		Thread thread = new Thread(demoRunner);

		thread.start();

	}
}
