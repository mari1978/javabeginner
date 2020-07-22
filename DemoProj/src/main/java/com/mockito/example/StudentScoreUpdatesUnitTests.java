package com.mockito.example;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
//import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class StudentScoreUpdatesUnitTests {

	

	@Before
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
	}

	@Mock
	public IDatabase mockDatabase;

	public StudentScoreUpdates studentScores;
	
	@Test
	public void calculateSumAndStore_withValidInput_shouldCalculateAndUpdateResultInDb() {
		// Arrange
		studentScores = new StudentScoreUpdates(mockDatabase);
		int[] scores = { 60, 70, 90 };
		Mockito.doNothing().when(mockDatabase).updateScores(anyString(), anyInt());

		// Act
		studentScores.calculateSumAndStore("student1", scores);

		// Assert
		Mockito.verify(mockDatabase, Mockito.times(1)).updateScores("student1", 230);
	}

}