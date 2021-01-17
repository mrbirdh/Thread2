package Thread;

public class UsingThread2 {
	public static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx2 thread = new ThreadEx2();
		
		startTime = System.currentTimeMillis();
		thread.start();
		
		for (int i = 0; i < 300; i++) {
			System.out.println("1");
		}
		
		System.out.println(
				"소요시간 1 :" + (System.currentTimeMillis() - UsingThread2.startTime) 	
		);
		
	}
}
