package com.ubs.opsit.interviews.clockrows;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstHourRowTest {

	private BerlinClockRows firstHourRow;
	
	@Before
	public void setUp(){
		firstHourRow = new FirstHourRow();
	}
	
	/**
	 * Check for the number of lamps in first row
	 */
	@Test
	public void testNumberOfLamps(){
		Assert.assertEquals(4, firstHourRow.getTotalLamps());
		Assert.assertEquals(4, firstHourRow.getOnOf(24).length());
		Assert.assertEquals(4, firstHourRow.getOnOf(14).length());
	}
	
	/**
	 * First hour row lamp light should be red in color in size of 4 characters
	 */
	@Test
	public void testFirstHourRowTime(){
		Assert.assertEquals("OOOO", firstHourRow.getOnOf(0));
		Assert.assertEquals("ROOO", firstHourRow.getOnOf(9));
		Assert.assertEquals("RROO", firstHourRow.getOnOf(13));
		Assert.assertEquals("RRRO", firstHourRow.getOnOf(15));
		Assert.assertEquals("RRRR", firstHourRow.getOnOf(21));
		Assert.assertEquals("RRRR", firstHourRow.getOnOf(24));
	}
	
	/**
	 * First hour row lamp color is red
	 */
	@Test
	public void testColorOfClockFirstRow(){
		Assert.assertEquals(ColorCode.RED, firstHourRow.getOnColorCode());
	}
	
	@Test
	public void testColorCodeAfterModification(){
		Assert.assertEquals("OOOO", firstHourRow.modifyOutput("OOOO"));
		Assert.assertEquals("RROO", firstHourRow.modifyOutput("RROO"));
		Assert.assertEquals("RRRO", firstHourRow.modifyOutput("RRRO"));
		Assert.assertEquals("RRRR", firstHourRow.modifyOutput("RRRR"));
	}
}
