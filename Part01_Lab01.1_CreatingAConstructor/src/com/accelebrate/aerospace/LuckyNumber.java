
package com.accelebrate.aerospace;

class LuckyNumber {

	private int myLuckyNumber = 8;
	
	LuckyNumber(int numIn) {
		if (numIn < myLuckyNumber) {
			System.out.println("too low");
		} else if (numIn > myLuckyNumber) {
			System.out.println("too high");
		} else {
			System.out.println("just right");
		}
	}
	
}
