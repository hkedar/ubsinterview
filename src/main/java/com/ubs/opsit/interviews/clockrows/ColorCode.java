package com.ubs.opsit.interviews.clockrows;

public enum ColorCode {
	OFF("O"),
	YELLOW("Y"),
	RED("R"),
	THREE_YELLOW("YYY"),
	TWO_YELLOW_ONE_RED("YYR");
	
	private String code;
	private ColorCode(String code){
		this.code = code;
	}
	
	public String getCode(){
		return this.code;
	}
}
