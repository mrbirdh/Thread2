package Thread;

public class DaemonThreadTest {
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
		
		/*
		 * ���󾲷���� �⺻��������� �� ���� ��� ��ġ�� �� �������� ���� 
		 */		
		t.setDaemon(true); 
		t.start();
		
		System.out.println("main Thread ����");
	}
}
