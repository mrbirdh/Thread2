package Thread;

public class NomalThreadTest {
	public static void main(String[] args) {
		
		Thread t = new Thread() {
			@Override 
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("MyThread ����");
				} catch (Exception e) {}
			}
		};
		
		t.start();//�������� �̹� ���ξ����尡 Runnable���� 
		
		System.out.println("main Thread ����");
	}
}
