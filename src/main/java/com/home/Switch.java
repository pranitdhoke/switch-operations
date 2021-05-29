package com.home;

public class Switch {

	private Switch() {
		
	}
	public static Switch createSwitch() {
		return new Switch();

	}

	public String getSwitchMode() {
		return "TV";
	}

}
