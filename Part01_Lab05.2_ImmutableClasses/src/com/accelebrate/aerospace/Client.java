package com.accelebrate.aerospace;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<Object> flavors = new ArrayList<>();
		
		flavors.add("vanilla");
		flavors.add("chocolate");
		flavors.add("strawberry");
		
		ImmutableLabeledList ill = new ImmutableLabeledList("flavors", flavors);
		
		System.out.println(ill.getList());
		
		ill.getList().set(0, "mint chocolate chip");
		
		System.out.println(ill.getList());
		
	}

}
