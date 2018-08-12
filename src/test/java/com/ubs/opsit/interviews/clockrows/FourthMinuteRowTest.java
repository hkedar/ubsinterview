package com.ubs.opsit.interviews.clockrows;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FourthMinuteRowTest {
	private BerlinClockRows fourthMinuteRow;

	@Before
	public void setUp() {
		fourthMinuteRow = new FourthMinuteRow();
	}

	/**
	 * Check for the number of lamps in fourth row
	 */
	@Test
	public void testNumberOfLamps() {
		Assert.assertEquals(4, fourthMinuteRow.getTotalLamps());
		Assert.assertEquals(4, fourthMinuteRow.getOnOf(24).length());
		Assert.assertEquals(4, fourthMinuteRow.getOnOf(59).length());
	}

	/**
	 * Fourth minute row lamp light should be red in color in size of 4 characters
	 */
	@Test
	public void testFourthMinuteRowTime() {
		Assert.assertEquals("OOOO", fourthMinuteRow.getOnOf(0));
		Assert.assertEquals("YYYY", fourthMinuteRow.getOnOf(9));
		Assert.assertEquals("YYYO", fourthMinuteRow.getOnOf(13));
		Assert.assertEquals("OOOO", fourthMinuteRow.getOnOf(15));
		Assert.assertEquals("YOOO", fourthMinuteRow.getOnOf(21));
		Assert.assertEquals("YYOO", fourthMinuteRow.getOnOf(22));
		Assert.assertEquals("YYYY", fourthMinuteRow.getOnOf(24));
		Assert.assertEquals("YYYY", fourthMinuteRow.getOnOf(59));
	}

	/**
	 * Fourth minute row lamp color is red
	 */
	@Test
	public void testColorOfClockFourthRow() {
		Assert.assertEquals(ColorCode.YELLOW, fourthMinuteRow.getOnColorCode());
	}
	
	@Test
	public void testColorCodeAfterModification(){
		Assert.assertEquals("OOOO", fourthMinuteRow.modifyOutput("OOOO"));
		Assert.assertEquals("YYOO", fourthMinuteRow.modifyOutput("YYOO"));
		Assert.assertEquals("YYYO", fourthMinuteRow.modifyOutput("YYYO"));
		Assert.assertEquals("YYYY", fourthMinuteRow.modifyOutput("YYYY"));
	}
	
}
