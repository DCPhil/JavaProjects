package com.baldr623;

import java.util.Arrays;
//import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DivisibleSumPairsTest {
	
	DivisibleSumPairs dsp = new DivisibleSumPairs();
	
	@Test
	public void dspTest() {
		//List<Integer> testList = Arrays.asList(1,2,3,4,5);
		Assert.assertEquals(0, dsp.divisibleSumPairs(1, 2, Arrays.asList(1, 2, 3, 4, 5)));
		Assert.assertEquals(5, dsp.divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
	}

}
