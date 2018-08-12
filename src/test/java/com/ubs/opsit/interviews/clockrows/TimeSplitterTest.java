package com.ubs.opsit.interviews.clockrows;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeSplitter;

public class TimeSplitterTest {
	/**
	 * Time splitter should return Hours, Minutes and Seconds value for a given time
	 */
	@Test
	public void testTimeUsingTimeSlippter(){
		TimeSplitter timeSplitter = new TimeSplitter("10:30:45");
		Assert.assertEquals(timeSplitter.getHour(), 10);
		Assert.assertEquals(timeSplitter.getMinute(), 30);
		Assert.assertEquals(timeSplitter.getSecond(), 45);
		
		timeSplitter = new TimeSplitter("21:13:17");
		Assert.assertEquals(timeSplitter.getHour(), 21);
		Assert.assertEquals(timeSplitter.getMinute(), 13);
		Assert.assertEquals(timeSplitter.getSecond(), 17);
	}
}
