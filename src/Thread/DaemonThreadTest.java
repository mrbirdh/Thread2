package Thread;

public class DaemonThreadTest {
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
		
		/*
		 * 데몬쓰레드는 기본쓰레드들이 할 일을 모두 마치면 그 시점에서 종료 
		 */		
		t.setDaemon(true); 
		t.start();
		
		System.out.println("main Thread 종료");
	}
}
