/**
 * 
 */
package com.home.state;

/**
 * @author pdhoke
 *
 */
public interface SwitchState {
	public void turnOn();

	public void turnOff();
	
	public State getState();

}
