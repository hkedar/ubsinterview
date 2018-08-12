package com.ubs.opsit.interviews.clockrows;

public class FirstHourRow extends BerlinClockRows{
	private static final int NUM_OF_LAMPS = 4;
	protected static final int VAL_OF_LAMP = 5;
	
	@Override
	public int getOnLamps(int time) {
		return (time - (time % VAL_OF_LAMP))/VAL_OF_LAMP;
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
