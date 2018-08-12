package com.ubs.opsit.interviews.clockrows;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeadLampTest {
	private BerlinClockRows headLamp;
	
	@Before
	public void setUp(){
		headLamp = new HeadLamp();
	}
	
	/**
	 * Check for the number of lamps in head lamp
	 */
	@Test
	public void testNumberOfLamps(){
		Assert.assertEquals(1, headLamp.getTotalLamps());
		Assert.assertEquals(1, headLamp.getOnOf(3).length());
		Assert.assertEquals(1, headLamp.getOnOf(14).length());
	}
	
	/**
	 * Headlamp should return yellow color when on 
	 */
	@Test
	public void testHeadLampOutputForSeconds(){
		Assert.assertEquals(ColorCode.YELLOW.getCode(), headLamp.getOnOf(0));
		Assert.assertEquals(ColorCode.YELLOW.getCode(), headLamp.getOnOf(2));
		Assert.assertEquals(ColorCode.OFF.getCode(), headLamp.getOnOf(3));
		Assert.assertEquals(ColorCode.YELLOW.getCode(), headLamp.getOnOf(16));
		Assert.assertEquals(ColorCode.OFF.getCode(), headLamp.getOnOf(59));
	}
	
	@Test
	public void testColorCodeAfterModification(){
		Assert.assertEquals("O", headLamp.modifyOutput("O"));
		Assert.assertEquals("Y", headLamp.modifyOutput("Y"));
	}
}
