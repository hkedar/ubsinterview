package com.ubs.opsit.interviews.clockrows;

public class SecondHourRow extends BerlinClockRows{

	private static final int NUM_OF_LAMPS = 4;
	
	@Override
	public int getOnLamps(int time) {
		return time % FirstHourRow.VAL_OF_LAMP;
	}

	@Override
	public int getTotalLamps() {
		return NUM_OF_LAMPS;
	}

	@Override
	public ColorCode getOnColorCode() {
		return ColorCode.RED;
	}

}
