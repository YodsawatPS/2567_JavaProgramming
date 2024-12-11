import java.util.*;

public class Lab204 {

	public static void main(String[] args) {		
		Scanner inputValue = new Scanner(System.in);
		System.out.print("Input value of X : ");
		int x = inputValue.nextInt();
		System.out.print("Input value of Y : ");
		int y = inputValue.nextInt();
		while (y < x) {
			System.out.print("Input value of Y, again : ");
			y = inputValue.nextInt();
		}
		System.out.println();
		int current = x + 1;
		int sum = x;
		for (int i = 11; i <= y; i++) {
			sum += current;
			System.out.println((sum - current) + " + " + i + " = " + sum);
			current++;
		}
		inputValue.close();
	}
}