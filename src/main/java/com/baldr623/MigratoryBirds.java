package com.baldr623;

import java.util.List;

public class MigratoryBirds {
	
	
	//This method accepts an Integer List representing birds of type 1-5 spotted
	//the number of each type is then counted and the type with the largest count is returned
	//in the case of two types having the same maximum, the lowest bird type is returned
	public int migratoryBirds(List<Integer> arr) {
		int[] counts = {0,0,0,0,0};
		int maxCount = counts[4];
		int type = 5;
		
		for(int i = 0; i < arr.size(); i++) {
			switch(arr.get(i)) {
			case 1:
				counts[0]++;
				break;
			case 2:
				counts[1]++;
				break;
			case 3:
				counts[2]++;
				break;
			case 4:
				counts[3]++;
				break;
			case 5:
				counts[4]++;
				break;
			}
		}
		for(int i = 4; i >= 0; i--) {
			if(counts[i] >= maxCount) {
				System.out.println("here: " + counts[i] + " " + maxCount);
				maxCount = counts[i];
				type = i + 1;
			}
		}
		return type;
	}

}
