package com.baldr623;

public class Binary {
	
	private String bin;
	
	//Method receives a positive integer number and returns the binary equivalent as a string using iteration
	public String convertIterative(int num) {
		bin = "";
		
		//Handles zero when passed into method
		if(num == 0 && bin == "") {
			return "0";
		}
		//Handles negative numbers
		if(num < 0 && bin == "") {
			return "No negative values allowed";
		}
		//Loop will run until num == 0
		while(num > 0 ) {
			
			//Checks modulus of num divided by 2 and if there is no remainder puts a zero in place 
			//Then concatenates the previous value to the "0"
			//Then halves the value of num
			if(num % 2 == 0) {
				bin = "0".concat(bin);
				num /= 2;
				
			//Else there is a remainder and puts a one in place 
			//Then concatenates the previous value to the "1"
			//Then halves the value of (num - 1)
			} else {
				bin = "1".concat(bin);
				 num = (num-1)/2;
			}
		}
		//After the loop completes returns the string value of the binary number calculated
		return bin;
	}
	
	//Method receives a positive integer number and returns the binary equivalent as a string using recursion
	public String convertRecursive(int num) {
		bin = "";		
		//Handles zero when passed into method
		if(num == 0 && bin == "") {
			return "0";
		}
		//Handles negative numbers when passed		
		if(num < 0 && bin == "") {
			return "No negative values allowed";
		}
		//Checks modulus of num divided by 2 and if there is no remainder
		//Then recursively calls method again sending num / 2
		//Then concatenates the returned value string with a "0"
		if(num % 2 == 0) {
			bin = convertRecursive(num /= 2).concat("0");
			
		//Checks modulus of num divided by 2 and if there is a remainder
		//Then recursively calls method again sending (num - 1) / 2
		//Then concatenates the returned value string with a "1"
		} else {
			bin = convertRecursive((num-1)/2).concat("1");
		}
		
		if(bin.startsWith("0")) {
			return bin.substring(1);
		} else {
			return bin;
		}
	}

}