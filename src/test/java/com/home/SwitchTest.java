/**
 * 
 */
package com.home;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.home.model.Switch;
import com.home.state.Mode;
import com.home.state.State;

/**
 * @author Pranit Dhoke
 *
 */
public class SwitchTest {
	
	private Switch systemUnderTest;

	@Test
	@DisplayName("Test case to create a switch")
	public void createSwitchTest() {
		
		systemUnderTest = Switch.createSwitch();
		assertThat(systemUnderTest).isNotNull();
		assertThat( systemUnderTest.getSwitchMode()).isNotNull();		
	}
	
	@Test
	@DisplayName("Test to check the default mode of switch")
	public void defaultModeStateOfSwitchTest() {
		//Given
		Mode defaultMode = Mode.TV;
		
		//When
		systemUnderTest = Switch.createSwitch();
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(defaultMode);
	
	}
	
	@Test
	@DisplayName("Test to check the default mode of switch")
	public void changeModeOfSwitchTest() {
		//Given
		Mode changedMode = Mode.REFRIGERATOR;
		Mode currentMode = Mode.TV;
		
		//When
		systemUnderTest = Switch.createSwitch();
		systemUnderTest.changeMode();
				
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
		assertThat(systemUnderTest.getSwitchMode()).isNotEqualTo(currentMode);
	
	}
	
	@Test
	@DisplayName("Test to change the state of TV to ON")
	public void changeStateToOnOfTvTest() {
		//Given
		systemUnderTest = Switch.createSwitch();
		Mode defaultMode = systemUnderTest.getSwitchMode();
		
		//When
		
		systemUnderTest.turnON();
				
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(defaultMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.ON);
	
	}
	
	@Test
	@DisplayName("Test to change the state of TV to Of when already in off state")
	public void changeStateToOffWhenAlreadyOfTvTest() {
		//Given
		systemUnderTest = Switch.createSwitch(Mode.TV);
		Mode defaultMode = systemUnderTest.getSwitchMode();
		
		//When
		
		systemUnderTest.turnOFF();
				
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(defaultMode);
		assertThat(systemUnderTest.getState()).isNotEqualTo(State.ON);
		assertThat(systemUnderTest.getState()).isEqualTo(State.OFF);
	
	}
	
	@Test
	@DisplayName("Test to change the mode and then the state to on and off")
	public void changeModeAndStateToOnAndOffTest() {
		//Given
		systemUnderTest = Switch.createSwitch();
		Mode defaultMode = systemUnderTest.getSwitchMode();
		
		//When
		
		systemUnderTest.turnON();
				
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(defaultMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.ON);
		
		//When
		
		systemUnderTest.changeMode();
		Mode changedMode = systemUnderTest.getSwitchMode();
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.OFF);
		
		//When
		systemUnderTest.turnON();
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.ON);
		
	
	}
	
	@Test
	@DisplayName("Test to create a switch with refrigerator as default mode and then change the state to on and off")
	public void createSwitchWithRefrigeratorAndChangeModeAndStateToOnAndOffTest() {
		//Given
		systemUnderTest = Switch.createSwitch(Mode.REFRIGERATOR);
		Mode defaultMode = systemUnderTest.getSwitchMode();
		
		//When
		
		systemUnderTest.turnON();
				
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(defaultMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.ON);
		
		//When
		
		systemUnderTest.changeMode();
		Mode changedMode = systemUnderTest.getSwitchMode();
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.OFF);
		
		//When
		systemUnderTest.turnON();
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.ON);
		
		//When		
		systemUnderTest.changeMode();
		changedMode = systemUnderTest.getSwitchMode();

		// Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.ON);
		
		//When
		systemUnderTest.turnOFF();
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
		assertThat(systemUnderTest.getState()).isEqualTo(State.OFF);
		
	
	}

}
