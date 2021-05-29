/**
 * 
 */
package com.home;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
		assertThat(systemUnderTest != null);
		assertThat(! systemUnderTest.getSwitchMode().isBlank());		
	}
	
	@Test
	@DisplayName("Test to check the default mode of switch")
	public void defaultModeStateOfSwitchTest() {
		//Given
		String defaultMode = "TV";
		
		//When
		systemUnderTest = Switch.createSwitch();
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(defaultMode);
	
	}
	
	@Test
	@DisplayName("Test to check the default mode of switch")
	public void changeModeOfSwitchTest() {
		//Given
		String changedMode = "Refrigerator";
		
		//When
		systemUnderTest = Switch.createSwitch();
		systemUnderTest.changeMode();
		
		
		//Then
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo(changedMode);
	
	}

}
