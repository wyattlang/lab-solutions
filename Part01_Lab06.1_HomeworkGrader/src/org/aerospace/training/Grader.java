package org.aerospace.training;

class Grader {

	private int numberOfAssignments;
	private int numberOfAssignmentsCompleted;
	
	Grader(Homework homework1) {
		doGrading(homework1);
	}
	
	Grader(Homework homework1, Homework homework2) {
		this(homework1);
		doGrading(homework2);
	}
	
	Grader(Homework homework1, Homework homework2, Homework homework3) {
		this(homework1, homework2);
		doGrading(homework3);
	}
	
	public double computeGrade() {
		return ((double) numberOfAssignmentsCompleted) / numberOfAssignments;
	}
	
	private void doGrading(Homework homework) {
		numberOfAssignments++;
		if (homework.getNumberOfQuestions() == homework.getNumberOfQuestionsCompleted()) {
			numberOfAssignmentsCompleted++;
		}
	}
	
}
