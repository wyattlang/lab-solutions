
package com.accelebrate.aerospace;

import java.time.LocalDate;
import java.time.Period;

final class StudentIdCard {

	private final String name;
	private final int studentNum;
	private final LocalDate birthDate;
	private final String major;
	
	StudentIdCard(String name, int studentNum, LocalDate birthDate, String major) {
		super();
		this.name = name;
		this.studentNum = studentNum;
		this.birthDate = birthDate;
		this.major = major;
	}

	String getName() {
		return name;
	}

	int getStudentNum() {
		return studentNum;
	}

	int getAge() {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}

	String getMajor() {
		return major;
	}
	
}
