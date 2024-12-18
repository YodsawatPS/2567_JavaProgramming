import java.util.*;

public class Lab303 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input a setence : ");
		String Massage = input.nextLine();

		while (!Massage.endsWith(".")) {
			System.out.print("Input a setence, again : ");
			Massage = input.nextLine();
		}
		int spaceCount = 0;
		for (int c = 0; c < Massage.length(); c++) {
			if (Massage.charAt(c) == ' ') {
				spaceCount++;
			}
		}
		String[] words = Massage.split("\\s+");
		int wordCount = words.length;

		System.out.println("This sentence has " + spaceCount + " spacebar.");
		System.out.println("This sentence has " + wordCount + " word.");

	}

}