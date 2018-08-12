package com.ubs.opsit.interviews.clockrows;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SecondHourRowTest {
	private BerlinClockRows secondHourRow;

	@Before
	public void setUp() {
		secondHourRow = new SecondHourRow();
	}

	/**
	 * Check for the number of lamps in second row
	 */
	@Test
	public void testNumberOfLamps() {
		Assert.assertEquals(4, secondHourRow.getTotalLamps());
		Assert.assertEquals(4, secondHourRow.getOnOf(24).length());
		Assert.assertEquals(4, secondHourRow.getOnOf(14).length());
	}

	/**
	 * Second hour row lamp light should be red in color and in size of 4 characters
	 */
	@Test
	public void testSecondHourRowTime() {
		Assert.assertEquals("OOOO", secondHourRow.getOnOf(0));
		Assert.assertEquals("OOOO", secondHourRow.getOnOf(10));
		Assert.assertEquals("RRRO", secondHourRow.getOnOf(13));
		Assert.assertEquals("RROO", secondHourRow.getOnOf(12));
		Assert.assertEquals("ROOO", secondHourRow.getOnOf(21));
		Assert.assertEquals("RRRR", secondHourRow.getOnOf(24));
	}
	
	/**
	 * Second hour row lamp color is red
	 */
	@Test
	public void testColorOfClockSecondRow(){
		Assert.assertEquals(ColorCode.RED, secondHourRow.getOnColorCode());
	}
	
	@Test
	public void testColorCodeAfterModification(){
		Assert.assertEquals("OOOO", secondHourRow.modifyOutput("OOOO"));
		Assert.assertEquals("RROO", secondHourRow.modifyOutput("RROO"));
		Assert.assertEquals("RRRO", secondHourRow.modifyOutput("RRRO"));
		Assert.assertEquals("RRRR", secondHourRow.modifyOutput("RRRR"));
	}
}
