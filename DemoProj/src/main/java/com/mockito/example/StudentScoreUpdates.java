package com.mockito.example;

public class StudentScoreUpdates {
	public IDatabase databaseImpl;

	public StudentScoreUpdates(IDatabase databaseImpl) {
		this.databaseImpl = databaseImpl;
	}

	public void calculateSumAndStore(String studentId, int[] scores) {
		int total = 0;
		for (int score : scores) {
			total = total + score;
		}
		// write total to DB
		databaseImpl.updateScores(studentId, total);
	}
}