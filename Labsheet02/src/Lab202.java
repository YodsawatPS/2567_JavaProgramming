import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		int previousNumber = Integer.MIN_VALUE;
		int currentNumber;
		while (true) {
			System.out.print("Input number : ");
			currentNumber = number.nextInt();
			if (currentNumber < previousNumber) {
				break;
			}
			previousNumber = currentNumber;
		}
		System.out.println();
		System.out.print("BYE BYE");
		number.close();
	}
}