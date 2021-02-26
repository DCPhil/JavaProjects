package com.baldr623;

import org.junit.Assert;
import org.junit.Test;

public class TrinaryTest {
	
	Trinary tri = new Trinary();

	@Test
	public void testTrinaryConvertIterative() {
		//Test method for passed 0
		Assert.assertEquals("0", tri.convertIterative(0));
		
		//Test method for passed 1
		Assert.assertEquals("1", tri.convertIterative(1));
		
		//Test method for passed 2, 3, 17, 175 and 439503
		Assert.assertEquals("2", tri.convertIterative(2));
		Assert.assertEquals("10", tri.convertIterative(3));
		Assert.assertEquals("122", tri.convertIterative(17));
		Assert.assertEquals("20111", tri.convertIterative(175));
		Assert.assertEquals("211022212220", tri.convertIterative(439503));
		
		//Tests method for passed negative integers
		Assert.assertEquals("No negative values allowed", tri.convertIterative(-1));
		Assert.assertEquals("No negative values allowed", tri.convertIterative(-17));
	}
	
	@Test
	public void testTrinaryConvertRecursive() {
		//Test method for passed 0
		Assert.assertEquals("0", tri.convertRecursive(0));
		
		//Test method for passed 1
		Assert.assertEquals("1", tri.convertRecursive(1));
		
		//Test method for passed 2, 3, 17, 175 and 439503
		Assert.assertEquals("2", tri.convertRecursive(2));
		Assert.assertEquals("10", tri.convertRecursive(3));
		Assert.assertEquals("122", tri.convertRecursive(17));
		Assert.assertEquals("20111", tri.convertRecursive(175));
		Assert.assertEquals("211022212220", tri.convertRecursive(439503));
		
		//Tests method for passed negative integers
		Assert.assertEquals("No negative values allowed", tri.convertRecursive(-1));
		Assert.assertEquals("No negative values allowed", tri.convertRecursive(-17));
	}

}
