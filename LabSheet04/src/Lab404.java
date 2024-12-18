import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		inputStudent();

	}

	public static void inputStudent() {

		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;

		while (true) {

			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();

			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();

			isStudentIDValid = isLength(studentID, 10);
			isSubjectCodeValid = isLength(subjectCode, 7);

			if (isStudentIDValid && isSubjectCodeValid) {

				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);

				displayData(isITStudent, isITSubject);
				break;
			} else {
				System.out.println("");
			}

		} // end while()
	}

	public static boolean isLength(String input, int len) {

		return input.length() == len;

	} 

}
