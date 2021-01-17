package Thread;

public class ThreadEx2 extends Thread {
	@Override
	public void run () {
		for (int i = 0; i < 300; i++) {
			System.out.println("2");
		}
		
		System.out.println(
				"소요시간 2 :" + (System.currentTimeMillis() - UsingThread2.startTime) 
		);
	}
}
