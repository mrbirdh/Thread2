package process;

public class NomalProcess2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); //현재시간
		for (int i = 0; i < 300; i++) {
			System.out.println("1");
		}
		
		System.out.println(
				"소유시간1 : " + (System.currentTimeMillis() - startTime
		));
		
		for (int i = 0; i < 300; i++) {
			System.out.println("2");
		}
		
		System.out.println(
				"소유시간2 : " + (System.currentTimeMillis() - startTime
		));
		
		
	}
}
