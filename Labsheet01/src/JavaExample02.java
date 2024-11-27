import javax.swing.*;

public class JavaExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUnit = Integer.parseInt(strProductUnit);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""
		       + "Input Price Unit: "));
		double totalPriceofProduct = productUnit * productPrice;
		
		double totalwithVat = totalPriceofProduct;
		String frmtotalPriceofProduct = String.format("%,.2f",totalPriceofProduct);
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		
	
		JOptionPane.showMessageDialog(null, 
				"Total Price is " + totalPriceofProduct + " baht."+
				"\nAdd VAT7% is "+ totalwithVat+ " baht.");
		
		

	}

}
