package com.ubs.opsit.interviews.clockrows;

public class HeadLamp extends BerlinClockRows{
	private static final int NUM_OF_LAMPS = 1;
	
	@Override
	public int getOnLamps(int time) {
		if(time%2 == 0){
			return 1;
		}
		return 0;
	}
	@Override
	public int getTotalLamps() {
		return NUM_OF_LAMPS;
	}
	@Override
	public ColorCode getOnColorCode() {
		return ColorCode.YELLOW;
	}
	
}
