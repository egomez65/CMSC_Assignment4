
/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 10/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ema Gomez
*/

public class Property {
	
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private int x;
	private int y;
	private int width;
	private int depth;
	
	Plot plot;
	
	public Property () {
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0.0;
		this.owner = "";
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
		plot = new Plot();

	}
	
	public Property ( String propertyName, String city, double rentAmount, String owner ) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
		
	}
	
	public Property ( String propertyName, String city, double rentAmount, String owner, 
			int x, int y, int width, int depth ) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;	
		plot = new Plot( x, y, width, depth);
		
	}
	
	public Property ( Property otherProperty ) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
		this.x = otherProperty.x;
		this.y = otherProperty.y;
		this.width = otherProperty.width;
		this.depth = otherProperty.depth;	
		plot = new Plot( otherProperty.plot );
		
	}
	
	public Plot getPlot() {
		return this.plot;
		
	}
	
	public String getPropertyName() {
		return this.propertyName;
		
	}
	
	public String getCity() {
		return this.city;
		
	}
	
	public double getRentAmount() {
		return this.rentAmount;
		
	}
	
	public String getOwner() {
		return this.owner;
		
	}
	
	public String toString() {
		return this.propertyName + "," + this.city + "," + this.owner + "," + this.rentAmount;
		
	}
	
}
