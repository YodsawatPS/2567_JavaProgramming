import javax.swing.JOptionPane;

public class Lab104 {

	public static void main(String[] args) {
		
        JOptionPane.showMessageDialog(null, "Welcome to the payroll appilication");		
		String name = JOptionPane.showInputDialog(null , "Enter employee name");
		int hour = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total hours for this employee."));		
		double grossE = hour * 7.5;
		double tax = grossE * 0.15;
		double salary = grossE - tax;
		
		String Massage = "Employee name: " + name +
				"\nHours Worked: " + hour +
				"\nHourly wage: $7.5 " + 
				"\nGross Earnings: $" + grossE + 
				"\nTax rate: 0.15" +
				"\nTax: $ " + tax +
				"\nNet earnings: $ " + salary;
		JOptionPane.showMessageDialog(null, Massage);
	}

}
