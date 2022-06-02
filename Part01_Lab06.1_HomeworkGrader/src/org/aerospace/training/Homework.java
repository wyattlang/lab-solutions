package org.aerospace.training;

class Homework {

	private int numberOfQuestions;
	private int numberOfQuestionsCompleted;
	
	Homework() {
		super();
	}

	Homework(int numberOfQuestions, int numberOfQuestionsCompleted) {
		super();
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfQuestionsCompleted = numberOfQuestionsCompleted;
	}

	int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	int getNumberOfQuestionsCompleted() {
		return numberOfQuestionsCompleted;
	}

	void setNumberOfQuestionsCompleted(int numberOfQuestionsCompleted) {
		this.numberOfQuestionsCompleted = numberOfQuestionsCompleted;
	}
	
}
