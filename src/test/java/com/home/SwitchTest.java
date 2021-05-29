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
	
	@Test
	@DisplayName("Test case to create a switch")
	public void createSwitchTest() {
		Switch systemUnderTest = Switch.createSwitch();
		assertThat(systemUnderTest != null);
		assertThat(! systemUnderTest.getSwitchMode().isBlank());
		assertThat(systemUnderTest.getSwitchMode()).isEqualTo("TV");
		
	}

}
