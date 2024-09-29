package hello.java;

import javax.swing.JOptionPane;

//Example 3: HelloNameDialog.java
public class HelloNameDialog {
	public static void main(String args[]) {
		String result;
		result = JOptionPane.showInputDialog("Doan Thanh Tung-5946 please enter your name:");
		JOptionPane.showMessageDialog(null, "Toi la Doan Thanh Tung 5946. Hi " + result + "!");
		System.exit(0);
	}
}
