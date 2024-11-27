import java.text.DecimalFormat;
import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input Product Name   : ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit   : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit : ");
		float productPrice = input.nextFloat();	
		float totalPrice = productUnit * productPrice;
		System.out.println("---------------------------------------------");
		System.out.println("Total price is "+ frm.format(totalPrice)+ " baht.");
		System.out.println("---------------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		float totalDiscount = totalPrice * discount /100;
		System.out.println("---------------------------------------------");
		float Amount = totalPrice - totalDiscount;
		System.out.println("Discount from"+discount +"%"+"      "+ frm.format(totalDiscount)+" baht.");
		System.out.println("Amount to be piad"+"    "+ frm.format(Amount)+ " baht.");
		
		input.close();

	}

}
