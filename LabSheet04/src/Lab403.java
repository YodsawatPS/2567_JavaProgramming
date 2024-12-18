import java.util.*;

public class Lab403 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;

		System.out.println("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();

		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0, space);

		System.out.println(addreviatName(fullName));

		input.close();

	}

	public static String addreviatName(String fName) {
		String intailLetter = "";

		for (int i = 0; i < fName.length(); i++) {
			
			if (fName.charAt(i) == ' '){					
				intailLetter = (intailLetter + fName.charAt(i + 1)).toUpperCase();
				intailLetter = intailLetter+".";
			}	
		}
		return intailLetter;	
	}

}
