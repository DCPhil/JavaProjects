package com.baldr623;

public class Trinary {
	
	private String tri;
	
	//Method takes in a positive integer and returns the trinary equivalent as a string using iteration
	public String convertIterative(int num) {
		
		tri = "";
		
		//Handles 0 passed into method
		if(num == 0) {
			return "0";
		}
		
		//Handles negative numbers passed into method
		if(num < 0) {
			return "No negative values allowed";
		}
		
		//Loops until num equals zero
		while(num > 0) {
			//Checks modulus of num divided by 3 and if there is no remainder puts a "0" in place 
			//Then concatenates the previous value to the "0"
			//Then divides num by three
			if(num % 3 == 0) {
				tri = "0".concat(tri);
				num /= 3;
			//Else checks modulus of (num - 1) divided by 3 and if there is no remainder puts a "1" in place 
			//Then concatenates the previous value to the "1"
			//Then divides (num - 1) by three
			} else if((num - 1) % 3 == 0) {
				tri = "1".concat(tri);
				num = (num - 1) / 3;
			//Else puts a "2" in place 
			//Then concatenates the previous value to the "2"
			//Then divides (num - 2) by three
			} else {
				tri = "2".concat(tri);
				num = (num - 2) / 3;
			}
		}
		
		//Returns the converted string
		return tri;
	}
	
	//Method to convert integer numbers to trinary using recursion
	public String convertRecursive(int num) {
		
		tri = "";
		
		//Handles 0 passed into method
		if(num == 0) {
			return "0";
		}
		
		//Handles negative numbers passed into method
		if(num < 0) {
			return "No negative values allowed";
		}
		
		//Checks modulus of num divided by 3 and if there is no remainder puts a "0" in place 
		//Then concatenates the "0" to the recursively returned value of num / 3
		if(num % 3 == 0) {
			tri = convertRecursive(num / 3).concat("0");
			num /= 3;
		//Else checks modulus of (num - 1) divided by 3 and if there is no remainder puts a "1" in place 
		//Then concatenates the "1" to the recursively returned value of (num - 1) /3
		} else if((num - 1) % 3 == 0) {
			tri = convertRecursive((num - 1) / 3).concat("1");
			num = (num - 1) / 3;
		//Else puts a "2" in place 
		//Then concatenates the "2" to the recursively returned value of (num - 2) /3
		} else {
			tri = convertRecursive((num - 2) / 3).concat("2");
			num = (num - 2) / 3;
		}
		if(tri.startsWith("0")) {
			return(tri.substring(1));
		} else {
			return tri;
		}
	}

}
