package com.ubs.opsit.interviews.clockrows;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThirdMinuteRowTest {
	private BerlinClockRows thirdMinuteRow;

	@Before
	public void setUp() {
		thirdMinuteRow = new ThirdMinuteRow();
	}

	/**
	 * Check for the number of lamps in third row
	 */
	@Test
	public void testNumberOfLamps() {
		Assert.assertEquals(11, thirdMinuteRow.getTotalLamps());
		Assert.assertEquals(11, thirdMinuteRow.getOnOf(24).length());
		Assert.assertEquals(11, thirdMinuteRow.getOnOf(59).length());
	}

	/**
	 * Third minute row lamp light should be yellow or red in color and red color will appear<br>
	 * for very quarter means the position is divisible by 3 (%3). Where position starts with 1.<br>
	 * Also the size of the output should be of 11 characters 
	 */
	@Test
	public void testThirdMinuteRowTime() {
		Assert.assertEquals("OOOOOOOOOOO", thirdMinuteRow.getOnOf(0));
		Assert.assertEquals("YYOOOOOOOOO", thirdMinuteRow.getOnOf(10));
		Assert.assertEquals("YYOOOOOOOOO", thirdMinuteRow.getOnOf(13));
		Assert.assertEquals("YYRYOOOOOOO", thirdMinuteRow.getOnOf(21));
		Assert.assertEquals("YYRYYRYYRYY", thirdMinuteRow.getOnOf(59));
	}
	
	/**
	 * Third minute row lamp color is yellow
	 */
	@Test
	public void testColorOfClockThirdRow(){
		Assert.assertEquals(ColorCode.YELLOW, thirdMinuteRow.getOnColorCode());
	}
	
	@Test
	public void testColorCodeAfterModification(){
		Assert.assertEquals("YYOOOOOOOOO", thirdMinuteRow.modifyOutput("YYOOOOOOOOO"));
		Assert.assertEquals("YYROOOOOOOO", thirdMinuteRow.modifyOutput("YYYOOOOOOOO"));
		Assert.assertEquals("YYRYYRYOOOO", thirdMinuteRow.modifyOutput("YYYYYYYOOOO"));
		Assert.assertEquals("YYRYYRYYRYY", thirdMinuteRow.modifyOutput("YYYYYYYYYYY"));
	}
}
