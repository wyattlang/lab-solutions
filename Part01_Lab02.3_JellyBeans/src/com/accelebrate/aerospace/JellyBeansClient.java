package com.accelebrate.aerospace;

class JellyBeansClient {

	public static void main(String[] args) {
		
		JellyBeans jb1 = new JellyBeans(5);
		JellyBeans jb2 = new JellyBeans(10);
		
		System.out.println(jb1.getAmountOfBeans());
		System.out.println(jb2.getAmountOfBeans());
		
	}

}
