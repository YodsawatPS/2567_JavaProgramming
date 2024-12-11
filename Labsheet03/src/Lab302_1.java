import javax.swing.JOptionPane;

public class Lab302_1 {

	public static void main(String[] args) {

		boolean chkEmail = false;

		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();

		// boolean validateEmail = false;

		// validateEmail = inputEmail.startsWith("@") || inputEmail.contains(" ");

		while(true) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
			while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
				inputEmail = JOptionPane.showInputDialog("Input your e-mail,again:");				
			}
			
			chkEmail = inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("hotmail.com");
			if (chkEmail) {
				JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com" + inputEmail);
				continue;
			}
		}
	}
}