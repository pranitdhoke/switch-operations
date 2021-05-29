package com.home;

public class Switch {

	private String mode;
	
	private Switch() {
		mode = "TV";
	}
	public static Switch createSwitch() {
		Switch switch1 =  new Switch();
		return switch1;

	}

	public String getSwitchMode() {
		return mode;
	}
	public void changeMode() {
			if(mode.equals("TV")) {
				mode = "Refrigerator";
			}else {
				mode = "TV";
			}
		
	}

}
