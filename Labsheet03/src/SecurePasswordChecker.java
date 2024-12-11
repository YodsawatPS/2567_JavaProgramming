import java.util.*;

public class SecurePasswordChecker {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Enter your password(type 'exit' to quit) :");
			String password = scan.nextLine();

			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}

			String error = "";
			if (password.length() < 8) {
				error += "- Password must be at least 8 characters long.\n";
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;

			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);

				if (ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				} else if (ch >= 'a' && ch <= 'z') {
					hasLowerCase = true;
				} else if (ch >= '0' && ch <= '9') {
					hasDigit = true;
				}
			}

			if (!hasUpperCase) {
				error += "- Password must comtain at lease one uppercase letter(A-Z).\n";
			} else if (!hasLowerCase) {
				error += "- Password must comtain at lease one lowercase letter(a-z).\n";
			} else if (!hasDigit) {
				error += "- Password must comtain at lease one  letter(0-9).\n";
			}

			if (error.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			} else {
				System.out.println("Password validateion error.");
				System.out.println(error);
			}
		}
		scan.close();
	}
}
