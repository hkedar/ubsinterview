package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.clockrows.FirstHourRow;
import com.ubs.opsit.interviews.clockrows.FourthMinuteRow;
import com.ubs.opsit.interviews.clockrows.HeadLamp;
import com.ubs.opsit.interviews.clockrows.BerlinClockRows;
import com.ubs.opsit.interviews.clockrows.SecondHourRow;
import com.ubs.opsit.interviews.clockrows.ThirdMinuteRow;

public class TimeConverterImpl implements TimeConverter{

	/**
	 * This enter and nextline regex is reuired since the output of each row are on separate line
	 */
	private static final String ENTER_NEXTLINE = "\r\n";
	
	/**
	 * <p>
	 * The code generates on off pattern string for each and every row including head lamp and <br>
	 * concatenate the output along with enter and newline regex.<br>
	 * The new line regex is appended to form the desired output
	 * </p>
	 */
	@Override
	public String convertTime(String time) {
		TimeSplitter timeSplitter = new TimeSplitter(time);
		BerlinClockRows headLamp = new HeadLamp();
		BerlinClockRows firstRow = new FirstHourRow();
		BerlinClockRows secondRow = new SecondHourRow();
		BerlinClockRows thirdRow = new ThirdMinuteRow();
		BerlinClockRows fourthRow = new FourthMinuteRow();
		
		StringBuilder arr = new StringBuilder();
		arr.append(headLamp.getOnOf(timeSplitter.getSecond())).append(ENTER_NEXTLINE);
		arr.append(firstRow.getOnOf(timeSplitter.getHour())).append(ENTER_NEXTLINE);
		arr.append(secondRow.getOnOf(timeSplitter.getHour())).append(ENTER_NEXTLINE);
		arr.append(thirdRow.getOnOf(timeSplitter.getMinute())).append(ENTER_NEXTLINE);
		arr.append(fourthRow.getOnOf(timeSplitter.getMinute()));
		return arr.toString();
	}

}
