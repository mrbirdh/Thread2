package Thread;

import javax.swing.JOptionPane;

public class UsingThread {
	public static void main(String[] args) {
		ThreadEx thread = new ThreadEx();
		thread.start();
		
		String input = JOptionPane.showInputDialog("정수 입력"); //여기서 블록 
		
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}
