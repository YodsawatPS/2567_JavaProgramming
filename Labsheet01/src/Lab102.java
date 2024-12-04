import java.util.*;

public class Lab102 {

	public static void main(String[] args) {
		
		Scanner inputminutes = new Scanner(System.in);
		System.out.print("Input the number of minutes : ");		
		int minutes = inputminutes.nextInt();
		int days = (minutes % 525960) / 1440;
		int year = (minutes / 525960);		
		System.out.print(minutes + " minutes is approximately " + year + " year and " + days +  " days");	        
	    inputminutes.close();
	}

}