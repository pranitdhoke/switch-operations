/**
 * 
 */
package com.home.model;

import com.home.state.State;
import com.home.state.SwitchState;

/**
 * @author pdhoke
 *
 */
public class Refrigerator implements SwitchState {
	
	private State state;
	
	public Refrigerator() {
		state = State.OFF;	
	}
	
	public static Refrigerator createRefrigertor() {
		return new Refrigerator();
	}

	@Override
	public void turnOn() {
		state = State.ON;

	}

	@Override
	public void turnOff() {
		state = State.OFF;
	}
	
	@Override
	public State getState() {
		return state;
	}

}

