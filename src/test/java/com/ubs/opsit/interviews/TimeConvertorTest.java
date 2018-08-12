package com.ubs.opsit.interviews;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeConvertorTest {
	private TimeConverter timeConverter;
	private Map<String, String> TIME_OUTPUT_MAP;
	
	@Before
	public void setUp(){
		timeConverter = new TimeConverterImpl();
		populateTimeAndOutputData();
	}
	
	/**
	 * Should return the ON/OFF and Colored pattern of Berlin clock for given time
	 */
	@Test
	public void testTimeConvertorOutputForGivenTime(){
		for(String time : TIME_OUTPUT_MAP.keySet()){
			Assert.assertEquals(TIME_OUTPUT_MAP.get(time), timeConverter.convertTime(time));
		}
	}
	/**
	 * Test data
	 */
	private void populateTimeAndOutputData(){
		TIME_OUTPUT_MAP = new HashMap<>();
		TIME_OUTPUT_MAP.put("00:00:00", "Y\r\n"+
										"OOOO\r\n"+
										"OOOO\r\n"+
										"OOOOOOOOOOO\r\n"+
										"OOOO");
		TIME_OUTPUT_MAP.put("23:59:59", "O\r\n"+
										"RRRR\r\n"+
										"RRRO\r\n"+
										"YYRYYRYYRYY\r\n"+
										"YYYY");
		
		TIME_OUTPUT_MAP.put("07:24:17", "O\r\n"+
										"ROOO\r\n"+
										"RROO\r\n"+
										"YYRYOOOOOOO\r\n"+
										"YYYY");
		
		TIME_OUTPUT_MAP.put("16:10:10", "Y\r\n"+
										"RRRO\r\n"+
										"ROOO\r\n"+
										"YYOOOOOOOOO\r\n"+
										"OOOO");
	}
}
