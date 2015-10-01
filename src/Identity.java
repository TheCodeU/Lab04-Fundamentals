public class Identity {
	public static void main(String[] args) {

		// create two Events and test for identity
		Event evt1 = new Event();
		Event evt2 = new Event();
		System.out.println("evt1 == evt2: " + (evt1 == evt2)); // different
																// objects

		// create a 2nd reference to one of the Event objects
		// (now have 2 references to the same object)
		Event evtCopy = evt2;
		System.out.println("evtCopy == evt2: " + (evtCopy == evt2)); // same
																		// object

		// create a Calculator reference but no Calculator object and test it
		// for null
		Calculator calc = null;
		boolean calcIsNull = (calc == null);
		System.out.println("calc is null: " + calcIsNull);

		// test String identity
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc"); // brand new String object

		System.out.println("s1 == s2: " + (s1 == s2)); // same object!
		System.out.println("s1 == s3: " + (s1 == s3)); // different objects

		// test String equality
		System.out.println("s1.equals(s3): " + s1.equals(s3));
	}
}
