import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {

	@Test
	void testManagementCompany() {
		ManagementCompany testCompany = new ManagementCompany();
		assertEquals("List of the properties for , taxID: \n"
				+ "______________________________________________________\n"
				+ "______________________________________________________\n"
				+ "\n"
				+ " total management Fee: 0.0",testCompany.toString());
	}

	@Test
	void testManagementCompanyStringStringDouble() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0);
		assertEquals("List of the properties for Gomez LLC, taxID: 1010101\n"
				+ "______________________________________________________\n"
				+ "______________________________________________________\n"
				+ "\n"
				+ " total management Fee: 0.0",testCompany.toString());
	}

	@Test
	void testManagementCompanyStringStringDoubleIntIntIntInt() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertEquals("List of the properties for Gomez LLC, taxID: 1010101\n"
				+ "______________________________________________________\n"
				+ "______________________________________________________\n"
				+ "\n"
				+ " total management Fee: 0.0",testCompany.toString());
	}

	@Test
	void testManagementCompanyManagementCompany() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		ManagementCompany otherCompany = new ManagementCompany (testCompany);
		assertEquals("List of the properties for Gomez LLC, taxID: 1010101\n"
				+ "______________________________________________________\n"
				+ "______________________________________________________\n"
				+ "\n"
				+ " total management Fee: 0.0", otherCompany.toString());
	}

	@Test
	void testAddPropertyStringStringDoubleString() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertEquals(testCompany.addProperty("Mansion", "Gotham", 5000.0, "Bruce Wayne"),0,0);
	}

	@Test
	void testAddPropertyStringStringDoubleStringIntIntIntInt() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertEquals(testCompany.addProperty("Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 4, 1, 1 ),0);
	}

	@Test
	void testAddPropertyProperty() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 3, 2, 10, 10 );
		Property testProperty = new Property ( "Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 2, 3, 4);
		assertEquals(testCompany.addProperty(testProperty),-3);
	}

	@Test
	void testRemoveLastProperty() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100 );
		Property testProperty1 = new Property ( "Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 4, 1, 1);
		Property testProperty2 = new Property ( "Pineapple", "Bikini Bottom", 50.0, "Spongebob Squarepants", 8, 8, 1, 1);
		testCompany.addProperty(testProperty1);
		testCompany.addProperty(testProperty2);
		testCompany.removeLastProperty();
		assertEquals(testCompany.getPropertiesCount(), 1);
	}

	@Test
	void testIsPropertiesFull() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100 );
		Property testProperty1 = new Property ( "Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 4, 1, 1);
		testCompany.addProperty(testProperty1);
		assertEquals(testCompany.isPropertiesFull(), false);
	}

	@Test
	void testGetPropertiesCount() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100 );
		Property testProperty1 = new Property ( "Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 4, 1, 1);
		Property testProperty2 = new Property ( "Pineapple", "Bikini Bottom", 50.0, "Spongebob Squarepants", 8, 8, 1, 1);
		assertEquals(testCompany.addProperty(testProperty1),0);
		assertEquals(testCompany.addProperty(testProperty2),1);
		assertEquals(testCompany.getPropertiesCount(), 2);
	}

	@Test
	void testGetTotalRent() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100 );
		Property testProperty1 = new Property ( "Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 4, 1, 1);
		Property testProperty2 = new Property ( "Pineapple", "Bikini Bottom", 50.0, "Spongebob Squarepants", 8, 8, 1, 1);
		testCompany.addProperty(testProperty1);
		testCompany.addProperty(testProperty2);
		assertEquals(testCompany.getTotalRent(), 5050.0);
	}

	@Test
	void testGetHighestRentProperty() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 10, 10);
		testCompany.addProperty( "Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 4, 1, 1 );
		testCompany.addProperty( "Pineapple", "Bikini Bottom", 50.0, "Spongebob Squarepants" );
		assertEquals(5000.0, testCompany.getHighestRentProperty().getRentAmount());
	}

	@Test
	void testIsMangementFeeValid() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertTrue(testCompany.isMangementFeeValid());
	}

	@Test
	void testGetName() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertEquals("Gomez LLC", testCompany.getName());
	}

	@Test
	void testGetTaxID() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertEquals("1010101", testCompany.getTaxID());
	}

	@Test
	void testGetProperties() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		Property testProperty1 = new Property ( "Mansion", "Gotham", 5000.0, "Bruce Wayne", 4, 4, 1, 1 );
		testCompany.addProperty(testProperty1);
		Property[] testProperties = testCompany.getProperties();
		assertEquals("Mansion,Gotham,Bruce Wayne,5000.0", testProperties[0].toString());
	}

	@Test
	void testGetMgmFeePer() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertEquals(5.0, testCompany.getMgmFeePer());
	}

	@Test
	void testGetPlot() {
		ManagementCompany testCompany = new ManagementCompany( "Gomez LLC", "1010101", 5.0, 1, 1, 100, 100);
		assertEquals("1,1,100,100", testCompany.getPlot().toString());
	}

	@Test
	void testToString() {
		Property sampleProperty = new Property ("Mansion", "Gotham", 5000.0, "Bruce Wayne",4,4,1,1);
		ManagementCompany mangementCo = new ManagementCompany("Gomez LLC", "1010101",6);
		assertEquals(mangementCo.addProperty(sampleProperty), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Gomez LLC, taxID: 1010101\n"
				+ "______________________________________________________\n"
				+ "Mansion,Gotham,Bruce Wayne,5000.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 300.0";
		System.out.println(expectedString);
		System.out.println(mangementCo.toString());
		assertEquals(expectedString, mangementCo.toString());
	}

}
