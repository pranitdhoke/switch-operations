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
public class TV implements SwitchState {
	
	private State state;
	
	private TV() {
		state = State.OFF;
	}
	
	public static TV createTV() {
		return new TV();
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
