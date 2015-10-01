class Students {

	public static void main(String[] args) {

		int x = new Integer("42");

		String wrapped = String.valueOf(42);

		// declare and initialize the array
		String[] students = new String[3];

		// fill it with first names of students in the classroom (long way)
		students[0] = "Suzanne";
		students[1] = "Edwin";
		students[2] = "Jason";

		// verify that the array length is 3
		System.out.println("the array is length: " + students.length);

		// print the values in the array
		System.out.print(students[0] + " ");
		System.out.print(students[1] + " ");
		System.out.println(students[2]);
		System.out.println();

		// declare, initialize, and fill the array with values
		String[] studentsEasy = { "Darrin", "Tommy", "Thaddeus", "Jackie" };

		// verify that the array length is 4
		System.out.println("the array is length: " + studentsEasy.length);

		// print the values in the array
		System.out.print(studentsEasy[0] + " ");
		System.out.print(studentsEasy[1] + " ");
		System.out.print(studentsEasy[2] + " ");
		System.out.println(studentsEasy[3]);
	}

	double pay(int hours, double rate) {

		double basePay = hours * rate;
		double multiplier = 0; // why declare it here?

		if (hours > 50) {
			multiplier = 1.75;
		} else {
			if (hours > 40) {
				multiplier = 1.5;
			} else {
				multiplier = 1;
			}
		}
		return basePay * multiplier;
	}

}