package com.home.model;

import com.home.state.Mode;
import com.home.state.State;
import com.home.state.SwitchState;

public class Switch {

	private Mode mode;
	private SwitchState state;
	private TV tv;
	private Refrigerator refrigerator;
	
	private Switch() {
		tv = TV.createTV();
		refrigerator = Refrigerator.createRefrigertor();
		mode = Mode.TV;	
		state = tv;
	}
	
	private Switch(Mode mode) {
		this();
		this.mode = mode;
		state = mode.equals(Mode.TV) ? tv : refrigerator;
		
		
	}
	public static Switch createSwitch() {
		return new Switch();
	}
	
	public static Switch createSwitch(Mode mode) {
		return new Switch(mode);		
	}

	public Mode getSwitchMode() {
		return mode;
	}
	public void changeMode() {
			if(mode.equals(Mode.TV)) {
				mode = Mode.REFRIGERATOR;
				state = refrigerator;
			}else {
				mode = Mode.TV;
				state = tv;
			}
		
	}
	public void turnON() {
		state.turnOn();
	}
	
	public void turnOFF() {
		state.turnOff();
	}
	
	public State getState() {
		return state.getState();
	}

}
