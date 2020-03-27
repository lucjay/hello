package co.lucjay.lambda;

//홀수출력
public class OddTask implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i += 3) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}