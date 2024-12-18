import javax.swing.JOptionPane;

public class Lab303_1 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Input a sentence : ");
		while (!input.endsWith(".")) {
			input = JOptionPane.showInputDialog("Input a sentence, again : ");
		}
		int space = 0;
		for (int c = 0; c < input.length(); c++) {
			if (input.charAt(c) == ' ') {
				space++;
			}
		}
		String[] words = input.split("\\s+");
		int wordCount = words.length;

		String massgae = "This sentence has " + space + " spaceber." + "\n" + "This sentence has " + wordCount
				+ " word.";
		JOptionPane.showMessageDialog(null, massgae);
	}
}