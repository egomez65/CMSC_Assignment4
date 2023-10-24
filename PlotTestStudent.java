import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlotTestStudent {

	@Test
	void testPlot() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		assertEquals("1,5,3,3",testPlot.toString());
	}

	@Test
	void testPlotIntIntIntInt() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		assertEquals("1,5,3,3",testPlot.toString());
	}

	@Test
	void testPlotPlot() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		Plot otherPlot = new Plot (testPlot);
		assertEquals("1,5,3,3", otherPlot.toString());
	}

	@Test
	void testOverlaps() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		Plot otherPlot = new Plot (0, 4, 2, 2);
		assertTrue(testPlot.overlaps(otherPlot));
	}

	@Test
	void testEncompasses() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		Plot otherPlot = new Plot (2, 4, 2, 2);
		assertTrue(testPlot.encompasses(otherPlot));
	}

	@Test
	void testSetX() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		testPlot.setX(3);
		assertEquals(3, testPlot.getX());
	}

	@Test
	void testSetY() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		testPlot.setY(2);
		assertEquals(2, testPlot.getY());
	}

	@Test
	void testSetWidth() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		testPlot.setWidth(4);
		assertEquals(4, testPlot.getWidth());
	}

	@Test
	void testSetDepth() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		testPlot.setDepth(5);
		assertEquals(5, testPlot.getDepth());
	}

	@Test
	void testGetX() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		assertEquals(1, testPlot.getX());
	}

	@Test
	void testGetY() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		assertEquals(5, testPlot.getY());
	}

	@Test
	void testGetWidth() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		assertEquals(3, testPlot.getWidth());
	}

	@Test
	void testGetDepth() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		assertEquals(3, testPlot.getDepth());
	}

	@Test
	void testToString() {
		Plot testPlot = new Plot ( 1, 5, 3, 3);
		assertEquals("1,5,3,3", testPlot.toString());
	}

}
