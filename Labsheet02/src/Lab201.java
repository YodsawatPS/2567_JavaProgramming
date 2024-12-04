import javax.swing.*;
import java.text.*;

public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		double totalPrice = numberofCustomer * BUFFET;
		//System.out.printf("Total Price is %,.2f bath.",totalPrice);
		do {		
			isMember = JOptionPane.showConfirmDialog(null, "Total price is " +frm.format(totalPrice) + " baht."
                    +"\nDo you have a member card?");
			
		}while(isMember == JOptionPane.CANCEL_OPTION);
			

		if (isMember==JOptionPane.YES_OPTION) {
			double priceAfterDiscount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid" +frm.format(priceAfterDiscount) + " baht.");										
		}else if (isMember==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid" +frm.format(totalPrice) + " baht.");			
		}
	}

}
