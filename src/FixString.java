
class FixString {

	public static void main(String[] args) {
		String a = "Jovo is      ";
		String b = " a great langu";

		// replace all o's with a's
		String s1 = a.replace('o', 'a');
		System.out.println(s1);

		// trim the whitespace off the end of s1
		String s1_trimmed = s1.trim();
		System.out.println(s1_trimmed);

		// concatenate "Java is" with " a great langu"
		String combined = s1_trimmed + b;
		System.out.println(combined);

		// now add the "age" on the end to get "Java is a great language"
		String result_lowercase = combined + "age";
		System.out.println(result_lowercase);

		// finally, convert to upper case
		String result = result_lowercase.toUpperCase();
		System.out.println(result);
		
		String cut = "cc345aaaaa";
		String dataToFind = "345";
		boolean isDataAvailable = cut.contains(dataToFind);
		System.out.println("Num is available? " + isDataAvailable);
		
		int whereDoesItStart = cut.indexOf(dataToFind);
		int lengthOfData = dataToFind.length();
		int endIndex = whereDoesItStart + lengthOfData;
		String dataFound = cut.substring(whereDoesItStart, endIndex);
		
		System.out.println("Here is the data!! " + dataFound);
	}
}