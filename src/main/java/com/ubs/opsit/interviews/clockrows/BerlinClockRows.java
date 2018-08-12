package com.ubs.opsit.interviews.clockrows;

public abstract class BerlinClockRows {
	/**
	 * Gets the total number of <b>ON</b> lamp for a given row in the clock.
	 * @param time
	 * @return Integer value denoting number of <b>ON</b> lamps 
	 */
	public abstract int getOnLamps(int time);
	
	/**
	 * Get total number of lamps on a given row of the clock.
	 * @return Integer total number of lamps
	 */
	public abstract int getTotalLamps();
	
	/**
	 * Get the color of the lamp for each row of the clock.
	 * @return
	 */
	public abstract ColorCode getOnColorCode();
	
	/**
	 * Get the lamp color on off sequence for each row of the lamp for a given time
	 * @param time
	 * @return
	 */
	public final String getOnOf(int time){
		int onLamps = getOnLamps(time);
		int offLamps = getTotalLamps() - onLamps;
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<onLamps; i++){
			builder.append(getOnColorCode().getCode());
		}
		
		for(int x=0; x<offLamps; x++){
			builder.append(ColorCode.OFF.getCode());
		}
		
		return modifyOutput(builder.toString());
	}
	
	/**
	 * Get the modified output for each row of the clock.<br>
	 * @param onoff
	 * @return
	 */
	public String modifyOutput(String onoff){
		return onoff;
	}
}
