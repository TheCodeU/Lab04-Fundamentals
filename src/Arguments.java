class Arguments {

	public static void main(String[] args) {

		/*
		 * Lab 4.3
		 */
		// see if args is null
		System.out.println("args is null: " + (args == null));

		// print the length of the array
		System.out.println("args.length = " + args.length);

		// print the 1st argument (index 0)
		System.out.println("the 1st argument is: " + args[0]);

		// print the 100th argument (index 99) - results in exception
		// System.out.println("100th argument = " + args[99]);

		/*
		 * Lab 4.4
		 */
		// convert command line arguments from string to double
		double arg1 = Double.parseDouble(args[0]);
		double arg2 = new Double(args[1]);
		double arg3 = Double.parseDouble(args[2]);

		// add them up and print out the result
		double sum = arg1 + arg2 + arg3;
		System.out.println("the sum of the arguments is: " + sum);
	}
}