import javax.swing.JOptionPane;

public class Lab103 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input Time Parking (minute):");
		int minute = Integer.parseInt(input);		
		int hour = minute / 60;
		int priceHour = hour * 50;	
		int timeP = minute % 60;
        double priceMinutes = 0.25;        
        double totalCost = (timeP * priceMinutes) + priceHour;       
        String message = "You parking " + hour + " Hour " + timeP + " Minute.\n"
        		+ "Amount to be paid is " + totalCost + " bath.";
        JOptionPane.showMessageDialog(null, message);
	}
}
