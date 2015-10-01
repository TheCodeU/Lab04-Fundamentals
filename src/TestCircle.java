
public class TestCircle {


	public static void main(String[] args) {

		Circle cir = new Circle();
		
		String input = "BLUE";
		
		Color convert = Color.valueOf(input);
		
		System.out.println(convert);
		
		cir.setColor(Color.BLUE);

	}

}
