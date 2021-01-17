package Thread;

public class NomalThreadTest {
	public static void main(String[] args) {
		
		Thread t = new Thread() {
			@Override 
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("MyThread 종료");
				} catch (Exception e) {}
			}
		};
		
		t.start();//시작전에 이미 메인쓰레드가 Runnable상태 
		
		System.out.println("main Thread 종료");
	}
}
