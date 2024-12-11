import java.util.*;
import java.text.*;

public class Lab208 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("####.00");
		// Declare constants
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		int salary, age;
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		employeeContribution = 0;
		employerContribution = 0;

		System.out.print("Enter the monthly salary: $");
		salary = input.nextInt();
		System.out.print("Enter the age: ");
		age = input.nextInt();
		if (salary > SALARY_CEILING) {
			contributableSalary = SALARY_CEILING;
		} else {
			contributableSalary = salary;
		}
		if (age <= 55) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
			totalContribution = employeeContribution + employerContribution;
			System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
					+ "\nThe employer's contribution is: $" + frm.format(employerContribution)
					+ "\nThe total contribution is: $" + frm.format(totalContribution));
		} else if (age > 55 && age <= 60) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
			totalContribution = employeeContribution + employerContribution;
			System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
					+ "\nThe employer's contribution is: $" + frm.format(employerContribution)
					+ "\nThe total contribution is: $" + frm.format(totalContribution));
		} else if (age > 60 && age <= 65) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
			totalContribution = employeeContribution + employerContribution;

			System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
					+ "\nThe employer's contribution is: $" + frm.format(employerContribution)
					+ "\nThe total contribution is: $" + frm.format(totalContribution));
		} else {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
			totalContribution = employeeContribution + employerContribution;
			System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
					+ "\nThe employer's contribution is: $" + frm.format(employerContribution)
					+ "\nThe total contribution is: $" + frm.format(totalContribution));
		}
		input.close();
	}
}