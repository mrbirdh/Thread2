package process;

public class NomalProcess2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); //����ð�
		for (int i = 0; i < 300; i++) {
			System.out.println("1");
		}
		
		System.out.println(
				"�����ð�1 : " + (System.currentTimeMillis() - startTime
		));
		
		for (int i = 0; i < 300; i++) {
			System.out.println("2");
		}
		
		System.out.println(
				"�����ð�2 : " + (System.currentTimeMillis() - startTime
		));
		
		
	}
}
