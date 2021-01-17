package process;

import javax.swing.JOptionPane;

public class NormalProcess {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("이름 : ");
		
		System.out.println("이름 : " + input);
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
		}
	}
}
