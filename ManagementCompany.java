
/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: 
 * Due: 10/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ema Gomez
*/

public class ManagementCompany {

	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_WIDTH = 10;
	public static final int MGMT_DEPTH = 10;
	private String name;
	private String taxID;
	private double mgmFee;
	private int x;
	private int y;
	private int width;
	private int depth;
	private String city;
	private double rent;
	private String owner;
	private Property properties[];
	private int numberOfProperties;
	Plot plot;
	ManagementCompany company;
	
	public ManagementCompany () {
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0.0;
		this.x = 0;
		this.y = 0;
		this.width = MGMT_WIDTH;
		this.depth = MGMT_DEPTH;
		this.city = "";
		this.rent = 0.0;
		this.owner = "";
		this.plot = new Plot( 0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property [MAX_PROPERTY];
		
	}
	
	public ManagementCompany ( String name, String taxID, double mgmFee ) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot( 0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property [MAX_PROPERTY];
		
	}
	
	public ManagementCompany ( String name, String taxID, double mgmFee, 
								int x, int y, int width, int depth ) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		this.plot = new Plot ( x, y, width, depth );
		this.properties = new Property [MAX_PROPERTY];
		
	}
	
	public ManagementCompany ( ManagementCompany otherCompany ) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.x = otherCompany.x;
		this.y = otherCompany.y;
		this.width = otherCompany.width;
		this.depth = otherCompany.depth;
		this.city = otherCompany.city;
		this.rent = otherCompany.rent;
		this.owner = otherCompany.owner;
		this.properties = otherCompany.properties;
		
	}
	
	public int addProperty ( String name, String city, double rent, String owner ) {
		Property newProperty = new Property( name, city, rent, owner);
        // Check if the array is full
    if (numberOfProperties >= MAX_PROPERTY) {
        return -1;
    }

        // Check if the Property object is null
    if (newProperty == null) {
        return -2;
    }

    // Check if the management company encompasses the property plot
    if (plot.encompasses(newProperty.getPlot())) {
        return -3;
    }

    // Check for overlap with existing properties
    for (int i = 0; i < numberOfProperties; i++) {
        if (newProperty.getPlot().overlaps(properties[i].getPlot())) {
            return -4;
        }
    }

    // Add the new property to the array
    properties[numberOfProperties] = newProperty;
    numberOfProperties++;
    return numberOfProperties - 1;
		
	}
	
	public int addProperty ( String name, String city, double rent, String owner,
							int x, int y, int width, int depth ) {
		Property newProperty = new Property( name, city, rent, owner, x, y, width, depth);
        // Check if the array is full
    if (numberOfProperties >= MAX_PROPERTY) {
        return -1;
    }

        // Check if the Property object is null
    if (newProperty == null) {
        return -2;
    }

    // Check if the management company encompasses the property plot
    if (plot.encompasses(newProperty.getPlot())) {
        return -3;
    }

    // Check for overlap with existing properties
    for (int i = 0; i < numberOfProperties; i++) {
        if (newProperty.getPlot().overlaps(properties[i].getPlot())) {
            return -4;
        }
    }

    // Add the new property to the array
    properties[numberOfProperties] = newProperty;
    numberOfProperties++;
    return numberOfProperties - 1;
		
	}
	
	public int addProperty ( Property property ) {
		Property newProperty = new Property(property);
        // Check if the array is full
		
		if (numberOfProperties >= MAX_PROPERTY) {
			return -1;
		}

        // Check if the Property object is null
		if (newProperty == null) {
			return -2;
		}

		// Check if the management company encompasses the property plot
		if (plot.encompasses(newProperty.getPlot())) {
			return -3;
		}

		// Check for overlap with existing properties
		for (int i = 0; i < numberOfProperties; i++) {
        if (newProperty.getPlot().overlaps(properties[i].getPlot())) {
            return -4;
        	}
		}

    // Add the new property to the array
    properties[numberOfProperties] = newProperty;
    numberOfProperties++;
    return numberOfProperties - 1;
		
	}
	
	public void removeLastProperty () {
        if ( properties[1] == null ) {
        	properties[0] = null;
        }
        else if (properties[2] == null) {
        	properties[1] = null;
        }
        else if (properties[3] == null) {
        	properties[2] = null;
        }
        else if (properties[4] == null) {
        	properties[3] = null;
        }
        numberOfProperties--;

            }
	
	public int getPropertiesCount() {
	    return this.numberOfProperties;
	}
	
	public double getTotalRent () {
		double totalRent = 0;
		
		for ( int i = 0; i < numberOfProperties; i++ ) {
			if ( properties[i] != null)
			totalRent += properties[i].getRentAmount();
		}
		
		return totalRent;
		
	}
	
	public Property getHighestRentProperty() {
	    if (numberOfProperties == 0) {
	        return null; // No properties in the array
	    }

	    Property highestRentProperty = properties[0];
	    double highestRent = properties[0].getRentAmount();

	    for (int i = 1; i < numberOfProperties; i++) {
	        double currentRent = properties[i].getRentAmount();
	        if (currentRent > highestRent) {
	            highestRentProperty = properties[i];
	            highestRent = currentRent;
	        }
	    }

	    return highestRentProperty;
	}
	
	public boolean isMangementFeeValid () {
		if ( mgmFee >= 0 && mgmFee <= 100) {
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean isPropertiesFull () {
        if ( numberOfProperties >= MAX_PROPERTY ) {
            return true;
        }
        return false;

    }
	
	public String getName () {
		return this.name;
		
	}
	
	public String getTaxID () {
		return this.taxID;
		
	}
	
	public Property[] getProperties () {
		return this.properties;
		
	}
	
	public double getMgmFeePer () {
		return this.mgmFee;
		
	}
	
	public Plot getPlot () {
		return this.plot;
		
	}
	
	public String toString () {
		String propertyString = "";
		double totalManagementFee = 0;
		for ( int i = 0; i < numberOfProperties; i++) {
			propertyString += properties[i].getPropertyName() + ",";
			propertyString += properties[i].getCity() + ",";
			propertyString += properties[i].getOwner() + ",";
			propertyString += properties[i].getRentAmount() + "\n";
			
			totalManagementFee += properties[i].getRentAmount();
			
		}
			totalManagementFee *= mgmFee * .01;

		
				return "List of the properties for " + this.name + ", taxID: " + this.taxID + "\n"
				+ "______________________________________________________\n" 
				+ propertyString
				+ "______________________________________________________\n" 
				+ "\n" 
				+ " total management Fee: " + totalManagementFee;
		
	}
	
}
