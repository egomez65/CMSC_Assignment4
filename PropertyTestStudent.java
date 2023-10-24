import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTestStudent {

	@Test
	void testProperty() {
		Property testProperty = new Property();
		assertEquals(",,,0.0",testProperty.toString());
	}

	@Test
	void testPropertyStringStringDoubleString() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell");
		assertEquals("Target,Cherry Hill,Brian Cornell,10000.0",testProperty.toString());
	}

	@Test
	void testPropertyStringStringDoubleStringIntIntIntInt() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell", 2, 3, 4, 4);
		Plot testPlot = new Plot(2, 3, 4, 4);
		assertEquals("Target,Cherry Hill,Brian Cornell,10000.0",testProperty.toString());
		assertEquals("2,3,4,4",testPlot.toString());
	}

	@Test
	void testPropertyProperty() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell", 2, 3, 4, 4);
		Property otherProperty = new Property (testProperty);
		assertEquals("Target,Cherry Hill,Brian Cornell,10000.0", otherProperty.toString());
	}

	@Test
	void testGetPlot() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell", 2, 3, 4, 4);
		assertEquals("2,3,4,4", testProperty.getPlot().toString());
	}

	@Test
	void testGetPropertyName() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell", 2, 3, 4, 4);
		assertEquals("Target", testProperty.getPropertyName());
	}

	@Test
	void testGetCity() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell", 2, 3, 4, 4);
		assertEquals("Cherry Hill", testProperty.getCity());
	}

	@Test
	void testGetRentAmount() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell", 2, 3, 4, 4);
		assertEquals(10000.0, testProperty.getRentAmount());
	}

	@Test
	void testGetOwner() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell", 2, 3, 4, 4);
		assertEquals("Brian Cornell", testProperty.getOwner());
	}

	@Test
	void testToString() {
		Property testProperty = new Property( "Target", "Cherry Hill", 10000.0, "Brian Cornell");
		assertEquals("Target,Cherry Hill,Brian Cornell,10000.0",testProperty.toString());
	}

}
