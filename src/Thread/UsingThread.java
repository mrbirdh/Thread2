package Thread;

import javax.swing.JOptionPane;

public class UsingThread {
	public static void main(String[] args) {
		ThreadEx thread = new ThreadEx();
		thread.start();
		
		String input = JOptionPane.showInputDialog("���� �Է�"); //���⼭ ��� 
		
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
	}
}
