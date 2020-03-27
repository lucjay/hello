package co.lucjay.lambda;

public class ThreadTest {
	public static void main(String[] args) {

		// 1~10출력 홀수// 객체 선언과 생성 -> 익명클래스
		Thread t1 = new Thread(() -> { // new Runnable(){ run () {} }
			for (int i = 1; i <= 100; i += 2) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		);
		t1.start();
		// 1~100 출력 짝수
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 100; i += 2) {
				System.out.println(i + "*");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}
		});
		t2.start();
	}
}
