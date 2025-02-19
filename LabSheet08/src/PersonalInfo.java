public class PersonalInfo {

	private Person name;

	private Date bDay;

	private int personID;

	public PersonalInfo() {

		name = new Person(null, null);

		bDay = new Date(0, 0, 0);

		personID = 0;

	}

	public PersonalInfo(String first, String last, int month, int day, int year, int ID) {

		name = new Person(first, last);

		bDay = new Date(month, day, year);

		personID = ID;

	}

	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {

		name = new Person(first, last);

		bDay = new Date(month, day, year);

		personID = ID;

	}

	public String toString() {

		return "Name: " + name.toString() + "\nDate of birth: " + bDay.toString() + "\nPersonal ID: " + personID;

	}

}
