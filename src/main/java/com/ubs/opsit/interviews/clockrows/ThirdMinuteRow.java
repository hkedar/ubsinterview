package com.ubs.opsit.interviews.clockrows;

public class ThirdMinuteRow extends BerlinClockRows {

	private static final int NUM_OF_LAMPS = 11;
	protected static final int VAL_OF_LAMP = 5;

	@Override
	public int getOnLamps(int time) {
		return (time - (time % VAL_OF_LAMP)) / VAL_OF_LAMP;
	}

	@Override
	public int getTotalLamps() {
		return NUM_OF_LAMPS;
	}

	@Override
	public ColorCode getOnColorCode() {
		return ColorCode.YELLOW;
	}

	/**
	 * The method is overridden since the ON/OFF pattern for the third row of
	 * the clock<br>
	 * changes for lamp denoting first, second and third quarter. <br>
	 * So YYY pattern is replace by YYR pattern
	 */
	@Override
	public String modifyOutput(String onOff) {
		return onOff.replaceAll(ColorCode.THREE_YELLOW.getCode(),
				ColorCode.TWO_YELLOW_ONE_RED.getCode());
	}

}
