package Lab1;

import javax.swing.JOptionPane;

//Doan Thanh Tung - 5946
public class ChoosingOption {
	public static void main(String args[]) {
		int option = JOptionPane.showConfirmDialog(null,
				"Doan Thanh Tung - 5946 - Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null,
				"Doan Thanh Tung - 5946 - You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "NO"));
		System.exit(0);
	}
}
