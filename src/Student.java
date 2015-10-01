import java.util.Calendar;


public class Student {

	/**
	 * 
	 */
	private int id;
	/**
	 * 
	 */
	private String name;
	
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/** 2012 Oct 8, 2012 hyq2
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This is the method to input data and calendar
	 * @param data
	 * @param calendar
	 * @return The information that I needed
	 * @throws NumberFormatException
	 */
	public String someMethod(String data, Calendar calendar) throws NumberFormatException{
		
		return "Stuff";
	}
	
}
