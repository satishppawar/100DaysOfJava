package basic.theading.demo;
class Runner extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("TheadDemo Using Thead :"+i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class TheadDemo1 {
	public static void main(String[] args) {
		Runner runner=new Runner();
		runner.start();
	}

}
