package com.baldr623;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	
	// This method compares two strings and returns the number of letters needed to make the two words anagrams
	// Will return zero if the words are already anagrams
	public int anagramTest(String A, String B) {
		
		int count = 0;
		
		List<String> multiChars = new ArrayList<String>();		
		
		for(int i = 0; i < A.length(); i++) {
			String regexVar = "[^" + A.substring(i, i + 1) + "]";
			if(B.replaceAll(regexVar, "").length() == 0) {
				count++;
			} else {
				if(!multiChars.contains(A.substring(i, i + 1))) {
					if(A.replaceAll(regexVar, "").length() > B.replaceAll(regexVar, "").length()) {
						count += A.replaceAll(regexVar, "").length() - B.replaceAll(regexVar, "").length();
						multiChars.add(A.substring(i, i + 1));
					}
				}
			}
		}
		
		for(int i = 0; i < B.length(); i++) {
			String regexVar = "[^" + B.substring(i, i + 1) + "]";
			if(A.replaceAll(regexVar, "").length() == 0) {
				count++;
			} else {
				if(!multiChars.contains(B.substring(i, i + 1))) {
					if(B.replaceAll(regexVar, "").length() > A.replaceAll(regexVar, "").length()) {
						count += B.replaceAll(regexVar, "").length() - A.replaceAll(regexVar, "").length();
						multiChars.add(B.substring(i, i + 1));
					}
				}
			}
		}
		
		return count;
	}

}
